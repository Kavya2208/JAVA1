class Account
{
  double balance;
  void addBalance(double value)
  {
      balance=balance+value;
  }
  
  double getBalance()
  {
     return balance;
  }

  void withdraw(double amount)
  {
     if(amount+1000<=balance)   // For the constraint that the account should have a balance of at least 1000
      {
        balance=balance-amount;
      }
     else
     {
       System.out.println("Inappropriate Balance");
     }
   }

  public static void main(String [] args)
  {
     Account acc=new Account();
     acc.addBalance(1000);
     acc.addBalance(acc.getBalance()*2);
     acc.withdraw(2000);
     System.out.println("Balance in the account is : " + acc.getBalance());
  }
}