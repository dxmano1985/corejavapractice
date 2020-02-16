/*


12. B. Line 10 calls the constructor on lines 3–5. That constructor calls the other constructor.
However, the constructor on lines 6–8 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null. 

For more information, see Chapter 4.

*/
 public class ConstructorFlow {

 private String color;

//Constructor 1
 public ConstructorFlow() {	
 	this("white");
	System.out.println("2.No Argument constructor - color: " + color);
 }

// Constructor 2
 public ConstructorFlow(String color) {
	System.out.println("1.String Argument constructor - color: " + color);
	 color = color;
	System.out.println("2.String Argument constructor - color: " + color);
 }


 public static void main(String[] args) {
	ConstructorFlow e = new ConstructorFlow();
	System.out.println("Color:" + e.color);
 }
 }
