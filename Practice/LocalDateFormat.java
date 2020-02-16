/*
* Format the Dates using DateTimeFormatter class
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 

class LocalDateFormat{

public static void main(String[] args){

System.out.println(LocalDate.parse("2018-02-05"));

System.out.println(LocalDate.parse("2018-02-05", DateTimeFormatter.ISO_LOCAL_DATE));

}
}