public class CheckingAccount extends Account
{
  private int nextCheckNumber = 1000;

  public CheckingAccount(double bal, int accountNum, String acType)
  {
    super(bal, accountNum, acType);
  }

  public void orderChecks()
  {
    nextCheckNumber = nextCheckNumber + 1000;
  }

  public int getCheckNumber()
  {
    return nextCheckNumber;
  }

  public String toString()
  {
    return "\n\nAccount Number: " + accountNum + "\nAccount Type: " + accType + "\nBalance: $" + String.format("%.2f", getBalance()) + "\nCurrent Check Number: " + getCheckNumber();
  }
}