package learning_java;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxInputException extends Exception {
    @Override
    public String getMessage() {
        return "the calculator is not capable of values larger than 100000";
    }
}

class MaxMultiplierReached extends Exception {
    public String getMessage() {
        return "multiplication cant handle inputs of more than 7000";
    }
}

class DivisionByZeroException extends Exception {
    public String getMessage() {
        return "Division by zero is not allowed";
    }
}

public class exercise_6 {

    public static double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division                                                                                            Done
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception                                                                             DONE
        3. Max Input Exception if any of the inputs is greater than 100000                                          DONE
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000          DONE
         */
        try (Scanner sc = new Scanner(System.in)) {
            double a;
            double b;
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();

            if (a > 100000 || b > 100000) {
                throw new MaxInputException();
            }

            System.out.print("""
                    What operation you want to perform: \s
                    1. a+b
                    2. a-b
                    3. a*b
                    4. a/b
                    """);

            System.out.print("Enter the number corresponding to the operation: ");
            int operation = sc.nextInt();

            double result;

            switch (operation) {
                case 1 -> result = a + b;
                case 2 -> result = a - b;
                case 3 -> {
                    if (a > 7000 || b > 7000) {
                        throw new MaxMultiplierReached();
                    }
                    result = a * b;
                }
                case 4 -> result = divide(a, b);
                default -> {
                    System.out.println("Invalid operation selected.");
                    return;
                }
            }

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (MaxInputException | MaxMultiplierReached | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}