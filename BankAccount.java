import java.util.Scanner;

public class BankAccount
{
    int accno;
    double balance;
    Scanner sc=new Scanner(System.in);

    BankAccount(int a, double b)
    {
        this.accno=a;
        this.balance-=b;
    }
    void withdraw()throws Exception
    {
       double amount;

        System.out.println("enter amount");
        amount=sc.nextInt();
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println(balance);
        }
        else{
            throw new Exception("insufficint balance");
        }
    }
    void deposit()
    {
        int amount;
        System.out.println("enter the amount to be deposited");
        amount=sc.nextInt();
        if(amount>=0)
        {
            balance=balance+amount;
            System.out.println("balance is"+balance);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    void show()
    {
        System.out.println("acc no is:"+accno+"balance is"+balance);
    }

}
class Arti1{
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(2351, 4500);
        Scanner sc = new Scanner(System.in);
        bank.show();
        bank.deposit();
        bank.show();
        try {
            bank.withdraw();
        } catch (Exception b) {
            System.out.println(b);
        }
        bank.show();
    }
}
