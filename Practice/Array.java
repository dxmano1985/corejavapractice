//import java.util.Arrays;

class Array{

public static void main(String args[]){


// creating an array
int[] numbers = new int[1];

System.out.println(numbers[0]);
numbers[0] = 1;
System.out.println(numbers.length);
System.out.println(numbers[0]);


//creating an array with default values

//int[] numbers1 = new int[]{4,6,2};
//int[] numbers1 = {4,6,2};
int numbers1        [] = {4,6,2};


System.out.println(numbers1.length);
System.out.println(numbers1[0]);


// No compile error when assigning character. it will assign equal int value.
numbers1[2] = 'a';
System.out.println(numbers1[2]);

// decalring multiple arrays in same line.

int[] a,b;
//a= {0,2};
a = new int[2];
b = new int[5];

// String array

String[] readWords = {"cookoo", "mmaa", "flight"};

System.out.println(readWords);
System.out.println(java.util.Arrays.toString(readWords));


// More on Arrays. Array Type Casting

String[] strings = {"xd"};

Object[] objects = strings;

//objects[0] = new StringBuilder();  // Run time error: java.lang.ArrayStoreException: java.lang.StringBuilder

objects[0] = "mano";

System.out.println(strings[0]);

String anotherStrings[] = (String[])objects;


System.out.println(anotherStrings[0]);




}