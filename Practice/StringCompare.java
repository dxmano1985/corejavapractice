/*
This program will help to identify the differences b/w equals() vs ==
when used to compare String
*/

class StringCompare{

public static void main(String[] args){

String s = "Hello";
String t = new String(s);


if(s.equals(t)) System.out.println("One"); // true
if(s==t) System.out.println("Two"); // false
if("Hello".equals(s)) System.out.println("Three"); //true
if("Hello" == s) System.out.println("four"); //true
if("Hello" == t) System.out.println("five"); // false
if("Hello".equals(t)) System.out.println("six"); //true



String a = "";
a += 2;
a += 'c';
a += false;
if ( a == "2cfalse") System.out.println("=="); // false .  Reason: a is not from String pool. derived from concate operations.
if ( a.equals("2cfalse")) System.out.println("equals"); // true. prints equlas.


}

}