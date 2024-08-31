package learning_java;

import java.util.HashSet;

@SuppressWarnings("ALL")
public class recursion {

    public static void main(String[] args) {
        System.out.println(guestPairing(4));
    }

    public static int guestPairing(int n){
        if(n <= 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int single_pair = guestPairing(n-1);
        int double_pair = (n-1)*(guestPairing(n-2));
        return single_pair+double_pair;
    }

    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacement = placeTiles(n-m,m);

        //horizontal
        int horPlacement = placeTiles(n-1,m);

        return vertPlacement+horPlacement;
    }

    public static int totalNumberOfPaths(int i,int j,int n,int m){
        //System.out.println(totalNumberOfPaths(0,0,3,3));
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int a = totalNumberOfPaths(i+1,j,n,m);
        int b = totalNumberOfPaths(i,j+1,n,m);
        return a+b;
    }

    public static void allPermutation(String str, String permutation){
/*      add this to main
        allPermutation("abc","");
*/
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char curchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            allPermutation(newStr, permutation + curchar);
        }
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printCombinations(String str, int index, int count, String combination) {
/*      add this in main
        printCombinations("11331833344",0,0,"");
*/
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];
        int charIndex = (count % mapping.length());
        combination += mapping.charAt(charIndex);
        if (index + 1 < str.length() && str.charAt(index + 1) == currChar) {
            printCombinations(str, index + 1, count + 1, combination.substring(0, combination.length() - 1));
        } else {
            printCombinations(str, index + 1, 0, combination);
        }
    }

    public static void uniqueSubSequence(int index, String str, String substring, HashSet<String> set) {
        /* add these in main to make it work
        HashSet<String> set= new HashSet<>();
        uniqueSubSequence(0,"aaa","",set);*/
        if (index == str.length()) {
            if (set.contains(substring)) {
                return;
            } else {
                System.out.println(substring);
                set.add(substring);
                return;
            }
        }
        char currchar = str.charAt(index);
        //to be
        uniqueSubSequence(index + 1, str, substring + currchar, set);
        //or not to be
        uniqueSubSequence(index + 1, str, substring, set);
    }

    public static void subsequence(int index, String str, String substring) {
        /* add these in main to make it work
        subsequence(0,"abc","");*/
        if (index == str.length()) {
            System.out.println(substring);
            return;
        }
        char currchar = str.charAt(index);
        //to be
        subsequence(index + 1, str, substring + currchar);
        //or not to be
        subsequence(index + 1, str, substring);
    }

    public static boolean[] map = new boolean[256];

    public static void removeDuplicate(int index, String str, String newString) {
        /*add this to in main
        removeDuplicate(0,"abbccda","");*/
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar]) {
            removeDuplicate(index + 1, str, newString);
        } else {
            newString += currChar;
            map[currChar] = true;
            removeDuplicate(index + 1, str, newString);
        }
    }

    public static void pushAllX(String str, int index, int count, String newString) {
        /*add this in main
        pushAllX("abcxfxxg",0,0,"");*/
        if (index == str.length()) {
            for (int i = 1; i <= count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currentchar = str.charAt(index);
        if (currentchar == 'x') {
            pushAllX(str, index + 1, count + 1, newString);
        } else {
            newString += currentchar;
            pushAllX(str, index + 1, count, newString);
        }
    }

    public static boolean isSorted(int[] arr, int index) {
        /*add this in main
        int[] arr = {1,2,3,4,5,5};
        System.out.println(isSorted(arr,0));*/
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            //array is sorted
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void fandLOcc(int index, char element, String str) {
        /*add this in main
          fandLOcc(0,'c',"acbhdcjdccbc");
        */
        if (index == str.length()) {
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
        fandLOcc(index + 1, element, str);
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