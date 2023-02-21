public interface BankInterface {

    double accountbalance();
    String withdrawl(int amount, String pass);
    String deposit(int amount);
    double interest(int time);
}
