package learning_java;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return " i am toString()";
    }

    public String getMessage() {
        return " i am getMessage()";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
//                throw new MyException();
                throw new ArithmeticException("this is a new exception!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
