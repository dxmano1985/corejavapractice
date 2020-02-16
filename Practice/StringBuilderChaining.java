/*
* Program to explain how StringBuilder object behaves with chain of methods.
*/

class StringBuilderChaining{


public static void main(String[] args){

// create a new StringBuilder object with a String "Xav"

 StringBuilder partName = new StringBuilder("Xav");
StringBuilder fullName = partName.append("ier");
partName.append(" Mano").append(" Durairaj");

//Guess what is the value of partName and fullName ?

System.out.println(partName);
System.out.println(fullName);

// yes, both prints the same value as both references points to the use the same object.


System.out.println(fullName.length());
System.out.println(fullName.capacity());

System.out.println(partName.length());
System.out.println(partName.capacity());
}

}