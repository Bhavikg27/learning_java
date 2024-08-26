package learning_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practice_test {
    public static void main(String[] args) {
        // Q1
        /*ArrayList<String> ar = new ArrayList<>();
        ar.add("student 1");
        ar.add("student 2");
        ar.add("student 3");
        ar.add("student 4");
        ar.add("student 5");
        ar.add("student 6");
        ar.add("student 7");
        ar.add("student 8");
        ar.add("student 9");
        ar.add("student 10");
        for(Object o:ar){
            System.out.println(o);
        }*/
        // Q2
        /*Date d = new Date();
        System.out.println(d.getHours() +":"+ d.getMinutes() +":"+ d.getSeconds());*/
        // Q3
        /*Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));*/
        // Q4
        /*LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("k:m:s");
        String mytime = ldt.format(dtf);
        System.out.println(mytime);*/
        // Q5
        /*HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(4);
        set.add(9);
        set.add(7);
        set.add(8);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(3);
        System.out.println(set);*/
    }
}