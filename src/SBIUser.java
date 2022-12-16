import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{

    public String name;
    private String accountNumber;
    private int balance;
    private String password;
    private static float rateOfInterest;

    public SBIUser(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;

        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int money) {
        balance = balance + money;
        return "Successfully Credited "+money+". Available balance is "+balance+".";
    }

    @Override
    public String withDrawMoney(int money, String EnteredPassword) {
        if(Objects.equals(EnteredPassword, password)) {
            if (money > balance) {
                return "Insufficient Funds.";
            } else {
                balance = balance - money;
                return "Successfully Debited " + money + ". Available balance is " + balance + ".";
            }
        }else{
            return "Wrong Password.";
        }
    }

    @Override
    public float calculateInterest(int years) {
        float interest = (balance * years * rateOfInterest)/100;
        return interest;
    }
}
