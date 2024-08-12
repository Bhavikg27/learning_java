package learning_java.learning_java;

import java.util.*;

class guessTheNumber{
    int input;
    int randomNumber;
    public void setInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        input= sc.nextInt();
    }
    public void setRandomNumber(){
        Random r=new Random();
        randomNumber=r.nextInt(100);
    }

    public void getRandomNumber() {
        System.out.println(randomNumber);
    }

    public void compare(){
        int attempts = 1;
        while (true) {
            if (input > randomNumber) {
                System.out.println("Think of a lower number");
            } else if (input < randomNumber) {
                System.out.println("Think of a higher number");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("The computer had guessed " + randomNumber);
                System.out.println("it took you " + attempts + " attempts");
                return; // Exit the method if the number is guessed correctly
            }
            attempts++;
            setInput(); // Ask for input again
        }

    }
}
public class exercise3 {
    public static void main(String[] args) {
        guessTheNumber user=new guessTheNumber();
        user.setInput();
        user.setRandomNumber();
        user.compare();
    }
}
