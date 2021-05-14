package EpamJavaCourse.aggregation7;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Deposit implements Comparable<Deposit> {
    public final BigDecimal amount;
    public final Integer period;

    public Deposit(BigDecimal depositAmount, Integer depositPeriod) {
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public abstract BigDecimal income();

    private BigDecimal totalSumAmount() {
        return income().add(amount);
    }

    @Override
    public int compareTo(Deposit obj) {
        if (obj != null) {
            return this.totalSumAmount().compareTo(obj.totalSumAmount());
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return amount.equals(deposit.amount) && period.equals(deposit.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, period);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + totalSumAmount() +
                ", period=" + period +
                '}';
    }
}