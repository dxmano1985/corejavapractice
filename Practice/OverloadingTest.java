/*
*/

class OverloadingTest{


public static void main(String[] args){
int a= 1;
Integer b= 2;

OverloadingTest ot = new OverloadingTest();
ot.printHello(a);
ot.printHello(b);
ot.printHello1("dai");
ot.printHello1(12);  // How this is considered as Object !!! is it considered as Integer ?? yes, Autoboxing int value to Integer.

ot.fly(123);
}

void printHello(int number){
System.out.println("Hello Xavier");
}

void printHello(Integer number){
System.out.println("Hello Mano");
}

void printHello1(String s){
System.out.println("Hello XMano");
}

void printHello1(Object o){
System.out.println("Hello Xavier Mano");
}


public void fly(long l) {
System.out.print("long ");
}

}