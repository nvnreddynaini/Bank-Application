import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name, Initial balance and Password.");
        String name = sc.nextLine();
        int balance = sc.nextInt();
        String password = sc.next();
        //creation of an SBI account
        SBIUser acc1 = new SBIUser(name,balance,password);
        System.out.println("The Acc no of new SBI account is "+acc1.getAccountNumber()+".");

        System.out.println("Enter the Money to be added.");
        int money = sc.nextInt();
        String NewBalance = acc1.addMoney(money);
        System.out.println(NewBalance);

        System.out.println("Enter the Money and Password to withdraw the Money.");
        int Money = sc.nextInt();
        String Password = sc.next();
        String newBalance = acc1.withDrawMoney(Money,Password);
        System.out.println(newBalance);
    }
}