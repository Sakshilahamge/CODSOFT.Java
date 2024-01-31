import java.util.Scanner;

public class Main {

    public enum ATMAction {
        BALANCE("Check Balance"),
        WITHDRAW("Withdraw Cash"),
        DEPOSIT("Deposit Cash"),
        EXIT("Exit");

        private final String description;

        ATMAction(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            printMenu();
            int actionIndex = scanner.nextInt();
            ATMAction selectedAction = ATMAction.values()[actionIndex];

            switch (selectedAction) {
                case BALANCE:
                    System.out.println("Your current balance is $1000");
                    break;
                case WITHDRAW:
                    System.out.println("Please enter the amount you want to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println("You have withdrawn $" + withdrawAmount);
                    break;
                case DEPOSIT:
                    System.out.println("Please enter the amount you want to deposit:");
                    double depositAmount = scanner.nextDouble();
                    System.out.println("You have deposited $" + depositAmount);
                    break;
                case EXIT:
                    isExit = true;
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Select an action:");
        for (ATMAction action : ATMAction.values()) {
            System.out.println(action.ordinal() + ". " + action.getDescription());
        }
    }
}