public class KOTAKacc implements BankInterface{
    private int balance;
    private int rateOfInterest;

    @Override
    public double accountbalance() {
        return 0;
    }

    @Override
    public String withdrawl(int amount,String eneterdpass) {
        return null;
    }

    @Override
    public String deposit(int amount) {
        this.balance += amount;
        return "Withdrawn Rs"+amount;
    }

    @Override
    public double interest(int time) {
        return (balance*rateOfInterest*time*0.01);
    }
}
