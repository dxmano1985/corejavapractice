// All Immutable classes in Java are final.

final class StringImmutable{

private String name = "John";

public static void main(String []ar){

StringImmutable strIm = new StringImmutable();

strIm.name = "jdaf";



// Another Scenario

String y = "Hello World";
String z = "  Hello World".trim();


System.out.println(y);
System.out.println(z);
System.out.println(y==z); //false
System.out.println(y.equals(z));  //true

}


}