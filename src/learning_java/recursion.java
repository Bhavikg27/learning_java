package learning_java.learning_java;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();

        System.out.println("Fibonacci sequence:");
        printFibonacci(numTerms);
        System.out.println();
        printreversefibonacci(numTerms);
        scanner.close();
    }

    // Method to print Fibonacci sequence up to numTerms terms
    public static void printFibonacci(int numTerms) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }


    public static void printreversefibonacci(int numTerms){
        int a = 0;
        int b = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(a + " ");
            int sum = b-a;
            b = a;
            a = sum;
        }
    }
}
