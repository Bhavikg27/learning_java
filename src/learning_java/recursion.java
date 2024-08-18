package learning_java;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        //        int numTerms = scanner.nextInt();
        //
        //        System.out.println("Fibonacci sequence:");
        //        printFibonacci(numTerms);
        //        System.out.println();
        //        printReverseFibonacci(numTerms);
        //        scanner.close();
        int number = scanner.nextInt();
        //printNto1(number);
        //print1toN(1,number);
        //SumOfNNaturalNumbers(1,number,0);
        //factorialOfN(1, number, 1);
        //System.out.println(factorialofn(number));
        System.out.println(printFibonacciSequence(number));
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

    // Method to print Reverse Fibonacci sequence up to numTerms terms
    public static void printReverseFibonacci(int numTerms) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.print(a + " ");
            int sum = b - a;
            b = a;
            a = sum;
        }
    }

    // printing N to 1
    public static void printNto1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    // printing 1 to N
    public static void print1toN(int i, int n) {
        System.out.println(i);
        if (i == n) {
            return;
        }
        print1toN(i + 1, n);

    }

    // sum of first n natural number
    public static void SumOfNNaturalNumbers(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        SumOfNNaturalNumbers(i + 1, n, sum);
    }

    //factorial of n
    //way 1
    public static void factorialOfN(int i, int n, int product) {
        if (n == 0 || n == 1) {
            System.out.println(1);
            return;
        } else if (i == n) {
            product *= i;
            System.out.println(product);
            return;
        }
        product *= i;
        factorialOfN(i + 1, n, product);
    }

    //way 2
    public static int factorialofn(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_of_n_minus_1 = factorialofn(n - 1);
        int fact_n = n * fact_of_n_minus_1;
        return fact_n;
    }

    public static int printFibonacciSequence(int n){
        // 0,1,1,2,3,5,8,13,21,34,55...
        if(n==0){
            System.out.println(0 + " ");
            return 0;
        } else if (n==1) {
            System.out.println(1 + " ");
            return 1;
        }

        int final_ans = printFibonacciSequence(n-1) + printFibonacciSequence(n-2);
        return final_ans;
    }
}
