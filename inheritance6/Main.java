package EpamJavaCourse.inheritance6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Employee numb1 = new Manager("bob", new BigDecimal(3000) , 160);

        System.out.println(numb1.toString());

        numb1.setBonus(new BigDecimal(2000));

        System.out.println(numb1.toString());
        System.out.println(numb1.toPay());
    }
}
