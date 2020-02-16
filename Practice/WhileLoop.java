/*
count++ - value will be increased by 1 in the next iteration
*/
public class WhileLoop{
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		System.out.println("Count: " + count);
		while(count++ < 3) { 


// count will be increased by 1 after the condition check. Loop will continue for the count values 0,1,2

			System.out.println("Count: " + count);
			int y = (1 + 2 * count) % 3;
			System.out.println("y: " + y);
			switch(y) {
				default:			// No break statement in default. case 0 will be executed for default case.
				case 0: x -= 1; break;
				case 1: x += 5;
				}
		}
	System.out.println("Count: " + count);
	System.out.println("x: " + x);
	}
}