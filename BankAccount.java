//Design a class to represent a bank account and include the following :
//Data members: Name of the depositor,Account number, Type of account, Balance amount in the account
//Methods:To assign initial values, To deposit an amount, To withdraw an amount after checking the minimum balance(Rs.1000), To display the name of the depositor and balance

import java.util.Scanner;

public class BankAccount {

    Scanner scanner = new Scanner(System.in);
    // Data members
    private String Name; // name of the account holder
    private int AccountNumber; // Account number
    private String TypeAccount; // Type of account
    private int BalanceAmount; // Balance amount

    // Input take from the user
    String NameInput() {
        // scanner.nextLine();
        String name;
        System.out.println("Enter your name :");
        name = scanner.nextLine();
        return name;
    }

    int AccountNumberInput() {
        int AC;
        System.out.println("Enter your Account number :");
        AC = scanner.nextInt();
        return AC;
    }

    String TypeAccountInput() {
        char ch;
        System.out.println("Enter Account Type( s:saving c:current)");
        ch = scanner.next().charAt(0);
        if (ch == 's') {
            return "saving";
        } else {
            return "current";
        }
    }

    public int BalanceAmountInput() {
        int A;
        System.out.println("Enter your Amount:");
        A = scanner.nextInt();
        return A;
    }

    // Methods

    // To assign initial values
    public void ToAssignInitialValues() {
        System.out.println("********************************************");
        System.out.println("----------Create your Bank account----------");
        this.Name = NameInput();
        this.AccountNumber = AccountNumberInput();
        this.TypeAccount = TypeAccountInput();
        this.BalanceAmount = 0;
        System.out.println("********************************************");
        System.out.println("----------Successfully created your bank account----------");
        System.out.println("----------Thank you !----------");
        scanner.nextLine();
    }

    // To deposit an amount
    public void ToDeposiAmount() {
        int an = AccountNumberInput();
        int DAmount = BalanceAmountInput();
        // check account number is correct or not
        if (AccountNumber == an) {
            if (DAmount > 0) {
                BalanceAmount += DAmount;
                System.out.println("Deposite successfull. New Balance amount :Rs." + BalanceAmount);
                return;
            } else {
                System.out.println("Invalid Amount");
            }
        } else {
            // Scan user input
            // Scanner scanner = new Scanner(System.in);
            System.out.println("Sorry ,a/c number: " + an + "  is not available in our database .");
            char ch;
            System.out.println("Do you want to retry (y/n)");
            ch = scanner.next().charAt(0);
            if (ch == 'y') {
                ToDeposiAmount();
            } else {
                return;
            }

        }
    }

    // To withdraw an amount after checking the minimum balance(Rs.1000)
    public void ToWithdrawAmount() {
        int an = AccountNumberInput();
        int WAmount = BalanceAmountInput();
        // check account number is correct or not
        if (AccountNumber == an) {
            if (WAmount > 0) {
                if (BalanceAmount - WAmount >= 1000) {
                    BalanceAmount -= WAmount;
                    System.out.println("Withdrawal successfull. New Balance amount : Rs." + BalanceAmount);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else {
                System.out.println("Invalid Amount");
            }
        } else {
            // Scan user input
            // Scanner scanner = new Scanner(System.in);
            System.out.println("Sorry ,a/c number: " + an + "  is not available in our database .");
            char ch;
            System.out.println("Do you want to retry (y/n)");
            ch = scanner.next().charAt(0);
            if (ch == 'y') {
                ToWithdrawAmount();
            } else {
                return;
            }

        }
    }

    // To display the name of the depositor and balance
    public void DisplayDetails() {
        int An = AccountNumberInput();
        // check account number is correct or not
        if (AccountNumber == An) {
            System.out.println("Account holder name: " + Name);
            System.out.println("Balance: Rs. " + BalanceAmount);
        } else {
            // Scan user input
            // Scanner scanner = new Scanner(System.in);
            System.out.println("Sorry ,a/c number: " + An + "  is not available in our database .");
            char ch;
            System.out.println("Do you want to retry (y/n)");
            ch = scanner.next().charAt(0);
            if (ch == 'y') {
                DisplayDetails();
            } else {
                return;
            }

        }
    }

    public void CallFunctions() {
        scanner.nextLine();
        System.out.println("1.To Deposite Amount.");
        System.out.println("2.To Withdraw Amount.");
        System.out.println("3.To Display details.");
        int num;
        num = scanner.nextInt();
        if (num == 1) {
            ToDeposiAmount();
        } else if (num == 2) {
            ToWithdrawAmount();
        } else if (num == 3) {
            DisplayDetails();
        } else {
            System.out.println("Invalid choice!");
        }

    }

    public static void main(String[] args) {
        System.out.println("--------------XYZ Bank , delhi,230880-----------");
        System.out.println("--------------Welcome-----------");
        BankAccount user = new BankAccount();
        user.ToAssignInitialValues();
        char choice = 'y';
        while (choice == 'y') {
            user.CallFunctions();
            System.out.println("Do you want to do again (y/n)!");
        }

        System.out.println("--------------Thank you-----------");
    }
}
