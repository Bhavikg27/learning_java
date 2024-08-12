package learning_java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class quizNestedLoops{

    quizNestedLoops(){
        int[] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the index: ");
        try{int ind = sc.nextInt();
            try {
                System.out.println("the value stored in the array at index " + ind + " is: " + marks[ind-1]);
                new quizNestedLoops();
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("this index does not exist, select array from 1 to " + marks.length);
                new quizNestedLoops();
            }
        }
        catch(Exception e){
            System.out.println("enter an integer number!");
            new quizNestedLoops();
        }

    }
}

public class nested_try_catch {
    public static void main(String[] args) {
        new quizNestedLoops();
//        try{
//            System.out.println("Welcome to nested try catch");
//            try{
//                System.out.println(marks[ind]);
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Sorry this index does not exist");
//                System.out.println("Exception in level 2");
//
//            }
//        }
//        catch(Exception e){
//            System.out.println("Exception in level 1");
//        }
    }
}