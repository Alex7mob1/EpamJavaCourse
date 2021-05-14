package EpamJavaCourse.aggregation7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class LongDeposit extends Deposit implements Prolongable {

    private Integer finalPeriod = 36;

    public LongDeposit(BigDecimal depositAmount, Integer depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {

        if (amount == null || amount.doubleValue() < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal incomeAmount = super.amount;
        BigDecimal percent = BigDecimal.valueOf(1.15);

        if (super.period > 6) {
            for (int i = 6; i < super.period; i++) {

                incomeAmount = incomeAmount.multiply(percent);
            }

            incomeAmount = incomeAmount.subtract(super.amount);

        } else {
            return BigDecimal.valueOf(0);
        }

        return incomeAmount.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public boolean canToProlong() {
        return period < finalPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LongDeposit that = (LongDeposit) o;
        return Objects.equals(finalPeriod, that.finalPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), finalPeriod);
    }
}