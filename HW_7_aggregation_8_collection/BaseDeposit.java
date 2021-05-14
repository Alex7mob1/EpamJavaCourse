package EpamJavaCourse.HW_7_aggregation_8_collection;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {

    public BaseDeposit(BigDecimal depositAmount, Integer depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {

        if (amount == null || amount.doubleValue() < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal finalAmount = super.amount;
        BigDecimal percent = BigDecimal.valueOf(1.05);

        for (int i = 0; i < super.period; i++) {
            finalAmount = percent.multiply(finalAmount);
        }

        finalAmount = finalAmount.setScale(2, RoundingMode.HALF_EVEN);

        return finalAmount.subtract(super.amount);
    }
}