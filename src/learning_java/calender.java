package learning_java;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calender {
    public static void main(String[] args) {
//        Calendar calendar =Calendar.getInstance();
//        System.out.println(calendar.getCalendarType());
//        System.out.println(calendar.getTimeZone().getID());
//        System.out.println(calendar.getTime());
//        System.out.println("TIME: " + calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
//        System.out.println("ERA: " + calendar.get(Calendar.ERA));
//        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
//        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
//        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
//        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
//        System.out.println("DATE: " + calendar.get(Calendar.DATE));
//        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
//        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
//        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
//        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
//        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
//        System.out.println("ZONE_OFFSET: "
//                + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
//        System.out.println("DST_OFFSET: "
//                + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));
//        System.out.println("Current Time, with hour reset to 3");
//        calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
//        calendar.set(Calendar.HOUR, 3);
//        System.out.println("ERA: " + calendar.get(Calendar.ERA));
//        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
//        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
//        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
//        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
//        System.out.println("DATE: " + calendar.get(Calendar.DATE));
//        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println("DAY_OF_WEEK_IN_MONTH: "
//                + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
//        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
//        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
//        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
//        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
//        System.out.println("ZONE_OFFSET: "
//                + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
//        System.out.println("DST_OFFSET: "
//                + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours

//        GregorianCalendar cal = new GregorianCalendar();
//        System.out.println(cal.isLeapYear(1700));

//        LocalDate d = LocalDate.now();
//        System.out.println(d);

//        LocalTime t = LocalTime.now();
//        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy||hh:mm:ss a -- E");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
