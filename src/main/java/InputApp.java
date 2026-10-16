import java.util.*;
//make changes to example
public class InputApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to add or subtract? ");

        String command = scanner.nextLine();
        if (command.equals("add")) {
            doAdd(scanner);
        } else if (command.equals("subtract")) {
            doSubtract(scanner);
        } else {
            System.out.printf("%s -- Invalid command!", command);
        }

        //added .close();
        scanner.close();


    }

    public static void doAdd(Scanner scanner) {

        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);

    }

    public static void doSubtract(Scanner scanner) {

        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double difference = num1 - num2;
        System.out.printf("%f - %f = %f", num1, num2, difference);



    }


}

