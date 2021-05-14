package EpamJavaCourse.HW_6_inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.doubleValue() < 0) {
            throw new IllegalArgumentException();
        }

        if (this.percent > 200) {
            super.bonus = bonus.multiply(BigDecimal.valueOf(3));
        } else if (this.percent > 100) {
            super.bonus = bonus.multiply(BigDecimal.valueOf(2));
        } else {
            super.bonus = bonus;
        }
    }
}