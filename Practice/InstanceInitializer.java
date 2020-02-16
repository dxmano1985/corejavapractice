/*
Constructor called after,
	Field initializer and Instance Initializer block
*/

class InstanceInitializer{

// Constructor
public InstanceInitializer(){
name = "Durairaj";
System.out.println("I am from constructor");
}

// Instance Initializer block
{
name = "Mano";
System.out.println("I am a Instance Initializer");
} 

// field initializer
String name = "Xavier";




public static void main(String []args){
InstanceInitializer inst = new InstanceInitializer();
System.out.println("name variable value: " + inst.name);

}

}