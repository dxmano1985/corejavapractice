/*
--You shouldn't declare the same variable name used in parameter of funtion.	
*/
public class MathFunctions  {
public void addToInt(int y, int amountToAdd) {
	int y = y + amountToAdd; // Wrong. You shouldn't declare the same variable name used in parameter of funtion.
}
public static void main(String[] args) {
MathFunctions  math = new MathFunctions();
	int a = 15;
	int b = 10;
	//MathFunctions.addToInt(a, b);
math.addToInt(a, b);
	System.out.println(a); 
}
}