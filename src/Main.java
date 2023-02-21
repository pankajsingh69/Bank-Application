import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,Password and Initial Balance");
        String name = sc.next();
        String password = sc.next();
        int bal = sc.nextInt();

        SBIacc sbi = new SBIacc(name,bal,password);
        System.out.println("Your acc. no is : "+sbi.getAccountno());
        System.out.println("Your current balance is : "+sbi.getBalance());
        System.out.println("Enter deposit amount: ");
        int depo = sc.nextInt();
        System.out.println(sbi.deposit(depo));
        System.out.println("Enter Your Withdrwal Amount");
        int amnt = sc.nextInt();
        System.out.println("Enter Your Password");
        String enterpass = sc.next();

        System.out.println(sbi.withdrawl(amnt,enterpass));

        //interest

        System.out.println("Enter the time for Interest");
        int time = sc.nextInt();

        System.out.println("Interest in "+time+"years : "+sbi.interest(time));
        System.out.println("Current Balance : "+(sbi.getBalance()+ sbi.interest(time)));

    }

}