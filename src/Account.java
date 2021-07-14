public class Account implements Comparable<Account>
{
  public double balance;
  public int accountNum;
  public String accType;

  public Account(double bala, int accountNum, String acType)
  {
    this.balance = bala;
    this.accountNum = accountNum;
    this.accType = acType;
  }

  public double getBalance()
  {
    return balance;
  }

  public int getAccnum()
  {
    return accountNum;
  }

  public String getAccType()
  {
    return accType;
  }

  public void setAccNum(int accNum)
  {
    accountNum = accNum;
  }

  public void setAccType(String acType)
  {
    accType = acType;
  } 

  public void deposit(double amt)
  {
    balance = balance + amt;
  }

  public void withdraw(double amt)
  {
    balance = balance - amt;
  }

  public int compareTo(Account a)
	{
		if (balance == a.balance)
      return 0;
    else if(balance > a.balance)
      return 1;
    else return -1;
	}
}