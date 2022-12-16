public interface BankInterface {
    int checkBalance();

    String addMoney(int money);

    String withDrawMoney(int Money, String Password);

    float calculateInterest(int years);
}
