/*
Month is Enum
*/

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

class LocalDateOutput{

public static void main (String[] args){

// Option A uses the old Calendar constants which are indexed from 0. This prints 2015-03-01
System.out.println(LocalDate.of(2015,Calendar.APRIL,1));

// This prints 2015-04-01
System.out.println(LocalDate.of(2015,Month.APRIL,1));

// System.out.println(new LocalDate());  // compile error 

//System.out.println(new LocalDate(2015,4,1));  // compile error. The specific constructor doesn't have public access.

}
}