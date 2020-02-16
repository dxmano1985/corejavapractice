/*
class and instance variables have default values and allow referencing. 
identifiers may begin with a letter, underscore, or dollar sign. 
non-static variable cannot be referenced from a static context
default value for String is null
default value for int is 0
Static method can refer instance variable using object of class where the instance variable declared.
Static method can refer static variable directly.

*/

class Variables{
static int $;  // static variable
String _S;  // instance variable

public void $get(){}

public static void main(String[] args){
	Variables varble = new Variables();
	System.out.print($);
	System.out.print(varble._S);
		//System.out.print(_S); 
}

}