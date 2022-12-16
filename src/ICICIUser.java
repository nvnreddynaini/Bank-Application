public class ICICIUser implements BankInterface{

    public String name;
    private int accountNumber;
    private int balance;
    private String Password;
    public int rateOfInterest;

    public ICICIUser(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public String addMoney(int money) {
        return null;
    }

    @Override
    public String withDrawMoney(int Money, String Password) {
        return null;
    }

    @Override
    public float calculateInterest(int years) {
        return 0;
    }
}
