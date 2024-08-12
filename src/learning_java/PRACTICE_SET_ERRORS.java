package learning_java;

import java.util.Scanner;

class MaxTries extends Exception {
    public String toString() {
        return " max tries of 5 reached";
    }

    public String getMessage() {
        return " you have consumed your 5 tries";
    }
}

class q_3 {
    static int a = 1;

    q_3() throws MaxTries {
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        while (a <= 5) {
            System.out.print("enter the index: ");
            try {
                int ind = sc.nextInt();

                try {
                    System.out.println("the value stored in the array at index " + ind + " is: " + marks[ind - 1]);
                    return;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("this index does not exist, select array from 1 to " + marks.length);
                    a++;
                }
            } catch (Exception e) {
                System.out.println("enter an integer number!");
                a++;
            }
        }
        throw new MaxTries();
    }
}

public class PRACTICE_SET_ERRORS {
    public static void main(String[] args) {
/*
        int a = 5
        b = 7;
*/
/*        try {
            Scanner sc = new Scanner(System.in);
            int a = 2520;
            int b = sc.nextInt();
            if (b < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
*/
        try {
            new q_3();
        } catch (MaxTries e) {
            System.out.println(e.getMessage());
        }
    }
}
