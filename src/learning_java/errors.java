package learning_java;

import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
        // SYNTAX ERROR
        /* int a = 0                        no semicolon
           b = 8;                           b not declared
           System.out.println(a+c);         variable c does not exist */

        //LOGICAL ERRORS
        /*System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }*/

        //RUN TIME ERROR
        /*float k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println(k);  */

    }
}
