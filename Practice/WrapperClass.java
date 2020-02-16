/*
* Java provides wrapper classes for each primitive types. It enables to use Collections framework on primitive types. Lets understand Wrapper classes in this program.

Wrapper Classes:

Integer
Byte
Short
Long
Float
Double
Boolean
Character

*/

import java.util.List;
import java.util.ArrayList;

class WrapperClass{

public static void main(String args[]){

// Create a List of int values using wrapper class

List<Integer> numbers = new ArrayList<>();

// convert int to Integer
numbers.add(new Integer(1));
numbers.add(1);  // Autoboxing. Automatically converts int to Integer class type.

System.out.println(numbers);
// convert Integer to int - valueOf
int value = Integer.valueOf(numbers.get(0));
int value1 = numbers.get(0); // Automboxing. Automatically converts Integer to int
System.out.println(value1);


// when to avoid autoboxing

List<Integer> series = new ArrayList<>();

series.add(1);
series.add(2);
System.out.println(series); //[1,2]

// remove the value 1.

//System.out.println(series.remove(1));  // this is removing index value
System.out.println(series.remove(new Integer(1)));  // forcing unboxed value.
System.out.println(series); // expected [2]




// Sorting

List<Integer> reading = new ArrayList<>();
reading.add(103);
reading.add(9);
reading.add(7);
reading.add(120);
// List.sort(reading);   // error: incompatible types: List<Integer> cannot be converted to Comparator
java.util.Collections.sort(reading);
System.out.println(reading);

}

}