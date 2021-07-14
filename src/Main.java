import java.util.ArrayList;
import java.util.Collections;  
class Main {
  public static void main(String[] args) 
  {
    CheckingAccount cA1 = new CheckingAccount(55.34, 2022, "Checking"), cA2 = new CheckingAccount(24.22, 2066, "Checking"), cA3 = new CheckingAccount(11.77, 4060, "Checking"), cA4 = new CheckingAccount(6783.23, 8938, "Checking");
    SavingsAccount sA1 = new SavingsAccount(43.33, 1337, "Savings"), sA2 = new SavingsAccount(683.25, 5693, "Savings"), sA3 = new SavingsAccount(231.45, 3412, "Savings"), sA4 = new SavingsAccount(932.94, 1234, "Savings");
    ArrayList<Account> myAccounts = new ArrayList<Account>();

    Collections.addAll(myAccounts, cA1, cA2, cA3, cA4, sA1, sA2, sA3, sA4);

    System.out.println("\nBalance of account number " + sA1.getAccnum() + " before deposit: $" + sA1.getBalance());
    sA1.deposit(10.22);//expected 53.55 after deposit //confirmed
    System.out.println("\nBalance of account number " + sA1.getAccnum() + " after deposit of $10.22: $" + sA1.getBalance());
    System.out.println("\nBalance of account number " + sA2.getAccnum() + " before withdraw: $" + sA2.getBalance());
    sA2.withdraw(20.05);//expected 663.20 after withdraw //confirmed
    System.out.println("\nBalance of account number " + sA2.getAccnum() + " after withdraw of $20.05: $" + sA2.getBalance());
    System.out.println("\nBalance of account number " + sA3.getAccnum() + " before compounding interest of %3: $" + sA3.getBalance());
    sA3.compound();//expected 238.39 after compounding interest added //confirmed
    System.out.println("\nBalance of account number " + sA3.getAccnum() + " after compounding interest of %3: $" + String.format("%.2f", sA3.getBalance()));
    System.out.println("\nBalance of account number " + cA4.getAccnum() + " before deposit: $" + cA4.getBalance());
    cA4.deposit(33.04);//expected 6816.27 after deposit //confirmed
    System.out.println("\nBalance of account number " + cA4.getAccnum() + " after deposit of $33.04: $" + String.format("%.2f", cA4.getBalance()));
    System.out.println("\nBalance of account number " + cA3.getAccnum() + " before withdraw: $" + cA3.getBalance());
    cA3.withdraw(10.02);//expected 1.75 //confirmed
    System.out.println("\nBalance of account number " + cA3.getAccnum() + " after withdraw of $10.02: $" + cA3.getBalance());
    System.out.println("\nAccount number " + cA2.getAccnum() + " current check number: " + cA2.getCheckNumber());//expected 100 //confirmed 
    cA2.orderChecks();
    System.out.println("\nCurrent check number after ordering checks for account number " + cA2.getAccnum() + ": " + cA2.getCheckNumber());//expected 2000 //confirmed
  
    Collections.sort(myAccounts);
    System.out.println("\nAccounts Sorted in Ascending Order by Balance:");
    System.out.println(myAccounts);
  }
}