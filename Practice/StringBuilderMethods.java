/*
* program to understand hpw charAt() method works on String
*/


class StringBuilderMethods{

public static void main(String[] args){

StringBuilder country = new StringBuilder("Denmark");

System.out.println(country.length());
System.out.println(country.charAt(0));
//System.out.println(country.charAt(9)); // java.lang.StringIndexOutOfBoundsException: String index out of range: 9


//StringBuilder sub= country.substring(2,3);
String sub= country.substring(2,3);
System.out.println(sub);


// insert() method


StringBuilder airline = new StringBuilder("QatarAirways");

airline.insert(5," " );
airline.insert(airline.length(),'*');
airline.insert(0,'*');
System.out.println(airline);







}
}