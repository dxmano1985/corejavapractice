/*
*  Undertand hpw java handled Dates in Java 7 or earlier.
*/
import java.util.Date;
import java.util.Calendar;
class DateOldWay{

public static void main(String[] args){

Date today = new Date();

System.out.println(today);

// Add a date

Calendar cal = Calendar.getInstance();

cal.setTime(today);
cal.add(Calendar.DATE,1);
System.out.println(cal.getTime());

// subtract a date


cal.add(Calendar.DATE, -1);
System.out.println(cal.getTime());

}

}