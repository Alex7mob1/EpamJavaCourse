package EpamJavaCourse.inheritance6;

import java.math.BigDecimal;

public class Manager extends Employee {

    private int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.doubleValue() < 0) {
            throw new IllegalArgumentException();
        }

        if (this.quantity > 150) {
            super.bonus = bonus.add(BigDecimal.valueOf(1000));
        } else if (this.quantity > 100) {
            super.bonus = bonus.add(BigDecimal.valueOf(500));
        } else {
            super.bonus = bonus;
        }
    }
}