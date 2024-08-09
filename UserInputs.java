
import java.util.Scanner;

class UserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? \n");
        String username = scanner.nextLine();

        System.out.printf("Hello %s. How old are you? \n", username);
        int age = Integer.parseInt(scanner.nextLine());

        // when requesting a floating number
        //double gpa = Double.parseDouble(scanner.nextLine());

        System.out.printf("Great! %d is an excellent age to start programming.What language do you prefer? \n", age);
        String language = scanner.nextLine();

        System.out.printf("Fantastic! %s is a very popular programming language. \n", language);

        scanner.close();
    }    
}
