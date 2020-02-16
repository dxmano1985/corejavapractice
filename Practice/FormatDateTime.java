import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class FormatDateTime{

public static void main(String[] args){
// Diffent formatters

DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

DateTimeFormatter mediumDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

//*********LocalDate formatting****************
LocalDate today = LocalDate.now();
System.out.println("Today : " + today);
System.out.println("Today shortDate: " + shortDate.format(today));
//System.out.println("Today shortDateTime: " + shortDateTime.format(today)); //Run Time error
//System.out.println("Today shortTime: " + shortTime.format(today)); //Run Time error
System.out.println("Today mediumDate: " + mediumDate.format(today));

System.out.println("****************");

//DateTime formatting
LocalDateTime currentDateTime = LocalDateTime.now();
System.out.println("currentDateTime : " + currentDateTime);
System.out.println("shortDatecurrentDateTime : " + shortDate.format(currentDateTime));
System.out.println("shortDateTimecurrentDateTime : " + shortDateTime.format(currentDateTime));
System.out.println("shortTimecurrentDateTime : " + shortTime.format(currentDateTime));

System.out.println("mediumDatecurrentDateTime : " + mediumDate.format(currentDateTime));
System.out.println("mediumDateTimecurrentDateTime : " + mediumDateTime.format(currentDateTime));
System.out.println("mediumTimecurrentDateTime : " + mediumTime.format(currentDateTime));

System.out.println("****************");

//Time formatting
LocalTime currentTime = LocalTime.now();
System.out.println("currentTime : " + currentTime);
//System.out.println("shortDatecurrentTime : " + shortDate.format(currentTime));
//System.out.println("shortDateTimecurrentTime : " + shortDateTime.format(currentTime));
System.out.println("shortTimecurrentTime : " + shortTime.format(currentTime));
System.out.println("mediumTimecurrentTime : " + mediumTime.format(currentTime));

}
}