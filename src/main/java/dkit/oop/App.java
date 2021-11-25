package dkit.oop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME;  // a predefined DateFormatter
import static java.time.temporal.ChronoUnit.DAYS;

public class App {
    public static void main(String[] args) {
        // Create LocalDateTime object from a String (in correct format YYY-MM-DDThh:mm:ss);
        String strDateTime = "2021-12-25T14:30:00";// Christmas dinner time (to the second!)
        LocalDateTime xmasDinner = LocalDateTime.parse(strDateTime);
        System.out.println("Christmas dinner time: " + xmasDinner);

        // Capture the current date and time (i.e. the moment this line of code is executed)
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time (now): " + now);

        // Create LocalDate by providing input arguments
        int year = 2021;
        int month = 12;
        int day = 17;
        int hour = 17;  // 17:00 i.e. 5pm
        LocalDateTime endOfSemester = LocalDateTime.of(year, month, day, hour, 0, 0);
        System.out.println("End of Semester Date: " + endOfSemester);

        // Try creating a date by providing invalid inputs. An exception will be thrown.
        // Exception in thread "main" java.time.DateTimeException

        //  The advantage of storing a date & time as a LocalDateTime object is that
        //  there are many methods available to manipulate the date and to compare it
        //  with other dates.  See some examples below.

        System.out.println("Day of the month is :  " + now.getDayOfMonth());
        System.out.println("Month is : " + now.getMonth());

        // How many days are there until Christmas day
        long days = DAYS.between(now, xmasDinner);
        System.out.println("Days from now until xmas dinner : " + days);

        // What date is it, 10 days from now
        LocalDateTime nowPlus10 = now.plusDays(10);  // add 10 days to 'now'
        System.out.println("Date, 10 days from now : " + nowPlus10);
        System.out.println("Date, 10 days from now (formatted) : " + nowPlus10.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // Determine if one DateTime is before another
        if (now.isBefore(xmasDinner))
            System.out.println("Today (now) is before Xmas Dinner Date");
        else
            System.out.println("Today (now) is past the Xmas Dinner Date");


//    TODO create a LocalDateTime object called myDateOfBirth and initialize it with
//    your time and date of birth using a String.
//    Calculate and display how old you are in days!
//
    // TODO Create a LocalDate object & determine what day of the week Christmas falls

    // TODO Determine how many days from now until Christmas day
        
    }
}
