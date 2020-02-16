public class HiddenMethod{
	public HiddenMethod() { 
		System.out.print("Deer"); 
	}
	public HiddenMethod(int age) { 
		System.out.print("DeerAge"); 
	}

// The below on is hidden method as it is used private access modifier.
	private boolean hasHorns() {
		 return false; 
	}
	public static void main(String[] args) {
		HiddenMethod deer = new Reindeer(5);
		System.out.println(","+deer.hasHorns());
	}
 }

class Reindeer extends HiddenMethod{
public Reindeer(){
//super();
}
	public Reindeer(int age) {
//super(2);
 System.out.print("Reindeer"); }


	public boolean hasHorns() { 
		return true; 
	}
}