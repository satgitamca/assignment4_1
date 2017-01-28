import java.util.*;
import java.util.Scanner;
class BankDemo 
{
Scanner scn=new Scanner(System.in);
double diposit, withdraw,balance=0;
void deposit()
{
     double ammount;
     System.out.println("Enter Amount for Diposit:");
     ammount=scn.nextInt();
     balance +=ammount;
}
public void withdraw() throws InsufficientFundsException
{
     double amount;
     System.out.println("Enter Amount for Withdrow:");
     amount=scn.nextInt();
    if (amount > balance)
        throw new InsufficientFundsException(balance);
    else
        balance -= amount;
  
}
}


public class assignment4_1 
{
   public static void main(String[] args)
   {
    BankDemo BD=new BankDemo();
    BD.deposit();
    try
    {
    BD.withdraw();
    }
    catch(InsufficientFundsException ex)
    {
         System.out.println("In Sufficient balance,Available balance is Rs. " + ex.getAmount());
    }
}
}
