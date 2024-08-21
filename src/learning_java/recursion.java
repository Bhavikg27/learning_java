package learning_java;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,9};
        System.out.println(isSorted(arr,0));
    }

    public static boolean isSorted(int arr[],int index){
        if(index== arr.length-1){
            return true;
        }
        if(arr[index]>=arr[index+1]){
            //array is sorted
            return false;
        }
        return isSorted(arr,index+1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void fandLOcc(int index, char element, String str) {
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(index);
        if (current == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        fandLOcc(index+1,element,str);
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

    //factorial of n - way 1
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
    //factorial of n - way 2
    public static int factorialOfN(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact_of_n_minus_1 = factorialOfN(n - 1);
        int fact_n = n * fact_of_n_minus_1;
        return fact_n;
    }

    public static void printFibonacciSequence(int a, int b, int n) {
        // 0,1,1,2,3,5,8,13,21,34,55...
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacciSequence(b, c, n - 1);
    }

    public static void printReverseFibonacciSequence(int a, int b, int n) {
        // 0,1,-1,2,-3,5,-8,13,-21,34...
        if (n == 0) {
            return;
        }
        int c = a - b;
        System.out.print(c + " ");
        printReverseFibonacciSequence(b, c, n - 1);

    }

    // math power with stack height = n
    public static int Math_power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int power = Math_power(x, n - 1);
        int answer = x * power;
        return answer;
    }
    // math power with stack height = log(n)
    public static int Math_power_2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return Math_power_2(x, n / 2) * Math_power_2(x, n / 2);
        } else {
            return Math_power_2(x, n / 2) * Math_power_2(x, n / 2) * x;
        }
    }

    public static void towerOfHanoi(int n, String src, String helper, String destination) {

        if (n == 1) {
            System.out.println("transfer " + n + " from " + src + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("transfer " + n + " from " + src + " to " + destination);
        towerOfHanoi(n - 1, helper, src, destination);
    }

    public static void printReverse(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printReverse(str, index - 1);
    }
}
