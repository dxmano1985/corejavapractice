class ShortCircuitOperators{


public static void main(String[] any){

String firstName = null;
String lastName = "David";

/*

// The below code will throw nullpointerexception at runtime.
// | will evalute both conditions

if( (lastName.equals("David")) | (firstName.equals("Miller")) ){

	System.out.println("firstname");
}
*/



// || here evaluates only left hand side of the condition.
if( (lastName.equals("David")) || (firstName.equals("Miller")) ){

	System.out.println("firstname");
}

}

}