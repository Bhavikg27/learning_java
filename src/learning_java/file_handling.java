package learning_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        /*
//      code to create a new File

        File myFile = new File("bhavik.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            throw new RuntimeException(e);
        }

//      code to write to a file

        try {
            FileWriter fileWriter = new FileWriter("bhavik.txt");
            fileWriter.write("this is our first file from this java course\nbye bye!!");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//      code to read a file

        File myFile = new File("bhavik.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line  = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//      code for deleting a file

        File myFile = new File("bhavik.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: "+ myFile.getName());
        }else{
            System.out.println("some error occurred while deleting the file");
        }
        */

        StringBuilder table = new StringBuilder();
        for (int i=2;i<10;i++) {
            for (int j = 0; j < 10; j++) {
                table.append(i).append("X").append(j + 1).append("=").append(i * (j + 1)).append("\n");
            }
            table.append("\n");
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
