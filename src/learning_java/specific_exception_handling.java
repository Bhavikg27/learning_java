package learning_java;

import java.io.IOException;
import java.util.Scanner;

public class specific_exception_handling {
    public static void main(String[] args) {
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is " + marks[ind]);
            System.out.println("the value of array value divided by number is " + marks[ind] / number);
        } catch (ArithmeticException a) {
            System.out.println("exception 1 occurred: " + a);
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("exception 2 occurred: " + i);
        } catch (Exception e) {
            System.out.println("exception 3 occurred: " + e);
        }
    }
}
