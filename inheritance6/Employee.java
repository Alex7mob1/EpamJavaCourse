package automationCoursesEpam.inheritance6;

import java.math.BigDecimal;

public abstract class Employee {

    protected String name;
    protected BigDecimal salary;
    protected BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        return this.salary.add(this.bonus);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}

