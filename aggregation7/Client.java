package EpamJavaCourse.aggregation7;

import java.math.BigDecimal;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Client implements Iterable<Deposit> {
    private Deposit[] deposits;
    private BigDecimal totalAmountValue;
    private BigDecimal maxIncomeValue;
    private int size;

    public Client() {
        deposits = new Deposit[10];
        totalAmountValue = new BigDecimal(0);
        maxIncomeValue = new BigDecimal(0);
        size = 0;
    }

    public boolean addDeposit(Deposit deposit) {
        if (size >= 10) {
            return false;
        }
        deposits[size] = deposit;
        size++;
        return true;
    }

    public BigDecimal totalIncome() {

        for (int i = 0; i < size; i++) {
            totalAmountValue = totalAmountValue.add(deposits[i].income());
        }
        return totalAmountValue;
    }

    public BigDecimal maxIncome() {

        for (int i = 0; i < size; i++) {

            if (deposits[i].income().compareTo(maxIncomeValue) > 0) {
                maxIncomeValue = deposits[i].income();
            }
        }
        return maxIncomeValue;
    }

    public BigDecimal getIncomeByNumber(Integer number) {
        for (int i = 0; i < size; i++) {
            if (number.equals(i)) {
                return deposits[i].income();
            }
        }
        return BigDecimal.valueOf(0);
    }

    public void sortDeposits() {
        for (int i = 0; i <= size - 1; i++) {
            if (deposits[i] != null) {
                int min = i;
                for (int j = i + 1; j <= size - 1; j++) {
                    if (deposits[j] != null && deposits[min].compareTo(deposits[j]) < 0) {
                        min = j;
                    }
                }
                Deposit deposit = deposits[min];
                deposits[min] = deposits[i];
                deposits[i] = deposit;
            }
        }
    }

    public int countPossibleToProlongDeposit() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (deposits[i] instanceof BaseDeposit) {
                continue;
            }
            Prolongable current = (Prolongable) deposits[i];
            if (current.canToProlong()) {
                count++;
            }
        }
        return count;
    }

    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.println(deposits[i]);
        }
    }

    @Override
    public Iterator<Deposit> iterator() {
        return new DepositIterator();
    }

    private class DepositIterator implements Iterator<Deposit> {
        int cursor;
        int lastRet = -1;

        DepositIterator() {
            cursor=0;
        }

        public boolean hasNext() {
            return cursor != size;
        }

        public Deposit next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Deposit[] elementData = Client.this.deposits;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            lastRet = i;
            return elementData[lastRet];
        }
    }
}