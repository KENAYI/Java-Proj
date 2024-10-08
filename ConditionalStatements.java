
import java.util.Scanner;

class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number; ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you wish to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        }else if (operation.equals("subtract")) {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        }else if (operation.equals("multiply")) {
            System.out.printf("%f x %f = %f", num1, num2, num1 * num2);
        }else if (operation.equals("divide")) { 
            if (num2 == 0) {
                System.out.println("Cannot divide by 0");
            }else {
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
        } 
        else {
            System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }
}
