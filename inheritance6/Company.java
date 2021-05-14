package EpamJavaCourse.inheritance6;

import java.math.BigDecimal;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal total = new BigDecimal(0);
        for (Employee employee : employees) {
            total = total.add(employee.toPay());
        }
        return total;
    }

    public String nameMaxSalary() {
        double max = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].toPay().doubleValue()) {
                max = employees[i].toPay().doubleValue();
                index = i;
            }
        }
        return employees[index].getName();
    }
}
