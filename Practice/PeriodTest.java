/*
* Program to understand the methods of Periods and Durations classes 
* And how to use it with LocalDate, LocalTime and LocalDateTime methods.
*/
import java.time.Period;
import java.time.Month;
import java.time.LocalDate; 
import java.time.LocalTime; 
import java.time.LocalDateTime; 
import java.time.Duration;


class PeriodTest{

public static void main(String args[]){

Period pDay = Period.ofDays(1);
Period pMonth = Period.ofMonths(1);

Duration dDay = Duration.ofDays(1);

// Print first day of all months from Jan to Dec 2020

LocalDate beginDay = LocalDate.of(2020, Month.JANUARY,1);
LocalDate endDay = LocalDate.of(2020, Month.DECEMBER,31);

LocalTime time = LocalTime.now();
LocalDateTime firstDay = LocalDateTime.of(beginDay, time);
LocalDateTime lastDay = LocalDateTime.of(endDay, time);

printDaysByPeriod(beginDay, endDay, pMonth);
}

//method to add period to beginDay and print in screen while beginDay is less than end Day
static void printDaysByPeriod(LocalDate beginDay, LocalDate endDay, Period period){

while (beginDay.isBefore(endDay)){

System.out.println(beginDay);
beginDay = beginDay.plus(period);

}
}

}

