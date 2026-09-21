import java.util.Scanner;

class ATM {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Your Balance = Rs. " + balance);
        }

        else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();

            balance = balance + amount;

            System.out.println("Deposit Successful!");
            System.out.println("Your Balance = Rs. " + balance);
        }

        else if (choice == 3) {
   System.out.print("Enter withdrawal amount: ");
     double amount = sc.nextDouble();

    if (amount <= balance) {
       balance = balance - amount;

   System.out.println("Please collect your money.");
    System.out.println("Remaining Balance = Rs. " + balance);
   }
    else {
 System.out.println("Insufficient Balance!");
            }
        }
  else if (choice == 4) {
     System.out.println("Thank you for using ATM!");
        }

        else {
            System.out.println("Invalid Choice!");
        }

    }
}