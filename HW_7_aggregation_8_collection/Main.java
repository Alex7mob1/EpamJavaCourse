package EpamJavaCourse.HW_7_aggregation_8_collection;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Deposit person1 = new BaseDeposit(new BigDecimal(100),9);
        System.out.println(person1.toString());
        System.out.println(person1.income());

        System.out.println("******************************");

        Deposit person2 = new SpecialDeposit(new BigDecimal(1500),2);
        System.out.println(person2.toString());
        System.out.println(person2.income());

        System.out.println("******************************");

        Deposit person3 = new LongDeposit(new BigDecimal(1000),2);
        System.out.println(person3.toString());
        System.out.println(person3.income());

        System.out.println("******************************");

        Client client = new Client();

        //System.out.println(client.iterator().next());
        System.out.println("******************************");

        System.out.println(client.iterator().hasNext());
//        client.addDeposit(person1);
//        client.addDeposit(person2);
//        client.addDeposit(person3);
//
//        System.out.println(client.totalIncome());
//
//        System.out.println("******************************");
//
//        System.out.println(client.maxIncome());
//
//        System.out.println("******************************");
//        System.out.println(client.getIncomeByNumber(2));
//
//        System.out.println("******************************");
//        System.out.println(client.countPossibleToProlongDeposit());
//        System.out.println("******************************");
//        client.sortDeposits();
//        client.printArr();

    }
}
