import java.util.UUID;

public class SBIacc implements BankInterface{

    private String name;
    private String accountno;

    private int balance;
    private String password;
    private double rateOfIntereset;

    //now we need constructor to get values like name,password and balance from the user as account no is generaated by bank


    public SBIacc(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
//        we need random account number we'll use UUID to generate it '
//        let rate of interest be 6%
        this.rateOfIntereset = 6.0;
        this.accountno = String.valueOf(UUID.randomUUID());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfIntereset() {
        return rateOfIntereset;
    }

    public void setRateOfIntereset(double rateOfIntereset) {
        this.rateOfIntereset = rateOfIntereset;
    }

    // we need getters and setters to use these private members #encapsulation
    @Override
    public double accountbalance() {
        return this.balance;
    }

    @Override
    public String withdrawl(int amount, String enteredpass) {
//        to withdraw money you need password
        if(enteredpass.equals(this.password)){
            if(balance < amount) return "Broke Nigga Don't have Enough Money";
            else{
                balance -= amount;
                return "amount withdrawn current balance : "+balance;
            }
        }else{
            return "Wrong Password!! DUMB NIGGA";
        }

    }

    @Override
    public String deposit(int amount) {
        this.balance += amount;
        return "Deposited, Current Balance Rs : "+this.balance;
    }

    @Override
    public double interest(int time) {
        return (balance*rateOfIntereset*time*0.01);
    }
}
