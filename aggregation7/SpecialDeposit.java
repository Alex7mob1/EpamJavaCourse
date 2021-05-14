package EpamJavaCourse.aggregation7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class SpecialDeposit extends Deposit implements Prolongable {

    private BigDecimal startSum = BigDecimal.valueOf(1000);

    public SpecialDeposit(BigDecimal depositAmount, Integer depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {

        if (amount == null || amount.doubleValue() < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal finalAmount = super.amount;
        BigDecimal percent = BigDecimal.valueOf(1.01);

        for (int i = 0; i < super.period; i++) {
            finalAmount = percent.multiply(finalAmount);
            percent = percent.add(BigDecimal.valueOf(0.01));
        }

        finalAmount = finalAmount.setScale(2, RoundingMode.HALF_EVEN);

        return finalAmount.subtract(super.amount);
    }

    @Override
    public boolean canToProlong() {
        return amount.compareTo(startSum) > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialDeposit that = (SpecialDeposit) o;
        return Objects.equals(startSum, that.startSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), startSum);
    }
}