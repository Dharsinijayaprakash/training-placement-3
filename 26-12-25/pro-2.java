import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        double balance = 5000;

        System.out.print("Enter PIN: ");
        if (sc.nextInt() != pin) {
            System.out.println("Invalid PIN");
            return;
        }

        int choice;
        do {
            System.out.println("\n1.Check Balance 2.Deposit 3.Withdraw 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Balance: " + balance);
                case 2 -> {
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if (amt <= balance)
                        balance -= amt;
                    else
                        System.out.println("Insufficient Funds");
                }
            }
        } while (choice != 4);
    }
}
