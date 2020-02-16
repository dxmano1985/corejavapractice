class ConstructorTest{

private int length;

private ConstructorTest(int length){
length = this.length;  // compiles. But not a good assignment.

System.out.print("I am constructor");

}


public static void main(String[] args){

new ConstructorTest();

}

}