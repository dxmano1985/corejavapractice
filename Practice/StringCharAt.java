/*
* program to understand hpw charAt() method works on String
*/


class StringCharAt{

public static void main(String[] args){

String country = "Denmark";

System.out.println(country.length());

System.out.println(country.charAt(0));
//System.out.println(country.charAt(9)); // java.lang.StringIndexOutOfBoundsException: String index out of range: 9

}
}