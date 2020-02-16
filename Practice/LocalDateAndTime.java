/*
* program to understand LocalDate, LocalTime, LocalDateTime classes of Java8.
*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;


class LocalDateAndTime{

public static void main(String[] args){

System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
System.out.println(LocalDateTime.now());

LocalDate date1 = LocalDate.of(2020,10,24);
//LocalDate date2 = LocalDate.of(2020,Month.FEBRUARY,32); // RUN TIME error
LocalDate date2 = LocalDate.of(2020,Month.FEBRUARY,29); 

LocalTime time1 = LocalTime.of(0,0,1);


LocalDateTime datetime = LocalDateTime.of(date1,time1);

System.out.println(date1);
System.out.println(date2);
System.out.println(datetime);

// before java 8 - logic to create date

Calendar cal = Calendar.getInstance();
cal.set(2020,Calendar.JANUARY,5);
Date date = cal.getTime();
System.out.println(date);



// Get today in Java 8

LocalDate today = LocalDate.now();
System.out.println("Today: " + today);

// Add a day

System.out.println("tomorrow: " + today.plusDays(1));

// Subtract a day

System.out.println("yesterdat: " + today.minusDays(1));


}

}
