import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Please enter the number you want to use in the transaction...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("First number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("");
        System.out.println("Select the type of transaction that you want to implement: ");
        System.out.println("For the collection --->   +");
        System.out.println("For the subtraction--->   -");
        System.out.println("For the multiplication operation  --->   *");
        System.out.println("for the division  --->   /");
        System.out.println("0 - Exit");

        char choosen = scanner.next().charAt(0);
        double secondNumber;
        double result;


        if (choosen == '0') {
            System.out.println("\nChecking out.");

        } else {
            while (choosen != '0') {

                if (!(choosen == '+' || choosen == '-' || choosen == '*' || choosen == '/')) {
                    System.out.println("\nYou made an incorrect entry, please try again.");
                    choosen = scanner.next().charAt(0);

                }
                if (choosen == '+') {
                    System.out.println("Enter the new number you want to use in the transaction:");
                    secondNumber = scanner.nextDouble();
                    result = firstNumber + secondNumber;
                    System.out.println("Sum of entered numbers: " + result);
                    firstNumber = result;
                    System.out.println("\nSelect transaction type: + , -, *, /\nPress 0 to exit.");
                    choosen = scanner.next().charAt(0);

                }
                if (choosen == '-') {
                    System.out.println("Enter the new number you want to use in the transaction:");
                    secondNumber = scanner.nextDouble();
                    result = firstNumber - secondNumber;
                    System.out.println("Result of subtraction: " + result);
                    firstNumber = result;
                    System.out.println("\nSelect transaction type: + , -, *, /\nPress 0 to exit.");
                    choosen = scanner.next().charAt(0);

                }
                if (choosen == '*') {
                    System.out.println("Enter the new number you want to use in the transaction: ");
                    secondNumber = scanner.nextDouble();
                    result = firstNumber * secondNumber;
                    System.out.println("Multiplying the entered numbers:: " + result);
                    firstNumber = result;
                    System.out.println("\nSelect transaction type: + , -, *, /\nPress 0 to exit.");
                    choosen = scanner.next().charAt(0);

                }
                if (choosen == '/') {
                    System.out.println("Enter the new number you want to use in the transaction:");
                    secondNumber = scanner.nextDouble();
                    result = firstNumber / secondNumber;
                    System.out.println("Division result of the entered numbers:: " + result);
                    firstNumber = result;
                    System.out.println("\nSelect transaction type: + , -, *, /\nPress 0 to exit.");
                    choosen = scanner.next().charAt(0);
                }
            }
        }
    }
}
