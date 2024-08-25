package learning_java;

import java.util.Date;

public class date_and_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()+1900);
    }
}