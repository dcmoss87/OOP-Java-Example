public class SavingsAccount extends Account
{
  private double interest = .03;

  public SavingsAccount(double bal, int accountNum, String acType)
  {
    super(bal, accountNum, acType);
  }

  public double getInterestRate()
  {
    return interest * 100;
  }

  public double compound()
  {
    balance = (balance * interest) + balance;
    return balance;
  }

  public String toString()
  {
    return "\n\nAccount Number: " + accountNum + "\nAccount Type: " + accType + "\nBalance: $" + String.format("%.2f", getBalance()) + "\nInterest Rate: %" + getInterestRate();
  }
}