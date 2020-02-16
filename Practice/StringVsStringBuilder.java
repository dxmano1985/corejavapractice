class StringVsStringBuilder{
public static void main(String[] args){

String s = "Java";

StringBuilder s1 = new StringBuilder("Java");

if(s.equals(s1)) System.out.println("One"); // No compile error. Nothing printed
if(!s.equals(s1)) System.out.println("Three"); // Prints Three

// if(s==s1) System.out.println("Two");
/*
C:\Users\dxman\Documents\Learning\Java\practice>javac StringVsStringBuilder.java
StringVsStringBuilder.java:10: error: incomparable types: String and StringBuilder
if(s==s1) System.out.println("Two");
    ^
1 error
*/


String roar1 = "roar";
StringBuilder roar2 = new StringBuilder("roar");
new StringVsStringBuilder().roar(roar1, roar2);
System.out.println(roar1 + " " + roar2);
}


public void roar(String roar1, StringBuilder roar2) {
roar1.concat("!!!");
roar2.append("!!!");
}

}