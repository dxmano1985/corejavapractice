/*
*  Learn initialize, the differnet methods of ArrayList 
*/


import java.util.ArrayList;

class ArrayListSamples{

public static void main(String[] args){
//initialize ArrayList - before Java 5
ArrayList list = new ArrayList();

// initialize ArrayList - after java 5

ArrayList<String> stringList = new ArrayList<String>(); // diamond symbol with type on both sides

// initialize ArrayList - after java 7

ArrayList<String> newStringList = new ArrayList<>(); // type on right hand side not needed.



// check default values.

System.out.println(list);  //[]
System.out.println(stringList);  //[]
System.out.println(newStringList);  //[]

//********Assign Values**********.

list.add("Xavier");  // Compiler Warning: ArrayListSamples.java:32: warning: [unchecked] unchecked call to add(E) as a member of the raw type ArrayList
list.add(2); // int works.
list.add(true); // boolean works

stringList.add("Xavier");
//stringList.add(true); // compile Error: ArrayListSamples.java:35: error: no suitable method found for add(boolean)


//stringList.add(2);
newStringList.add("Xavier");
System.out.println(list); 
System.out.println(stringList); 
System.out.println(newStringList); 


//****** get the values*********

// boolean isthisTrue = list.get(2); // error: incompatible types: Object cannot be converted to boolean
// int num = list.get(1); // error: incompatible types: Object cannot be converted to int
Object num = list.get(1); // working. ArrayList is storing as objects

System.out.println(num); // 2


// ****** add() *********

/* 
*  Syntax: 
* boolean add(E element)
* void add(int index, E element) 
*/

System.out.println(newStringList);
System.out.println(newStringList.add("Duriraj")); // returns true
newStringList.add(1,"Mano");  // returns void, you can't print it.
// newStringList.add(7,"Mano");  // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 3

System.out.println(newStringList); // [Xavier, Mano, Duriraj]


// ***** remove() ********
/*
* Syntax: 
boolean remove(Object object)
E remove(int index)
*/

System.out.println(newStringList.remove("Xavier")); // true
System.out.println(newStringList); // [Mano, Duriraj]

System.out.println(newStringList.remove("Xavier")); // false

System.out.println(newStringList.remove(0)); // Mano  . Printing the value removed from the index 0.
System.out.println(newStringList); // [Duriraj]

// System.out.println(newStringList.remove(8));  // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 8, Size: 1


// ******* set() **********
/*
* syntax:
*  E set(int index, E newElement)
*/
System.out.println(newStringList); // [Duriraj]
newStringList.add(0,"Mano");
System.out.println(newStringList); // [Mano, Duriraj]

System.out.println(newStringList.set(0,"Xavier")); // Mano   - prints the value it replaced at index 0
System.out.println(newStringList); // [Xavier, Duriraj]



// ****** contains() *******

System.out.println("contains Mano? " + newStringList.contains("Mano"));
System.out.println("contains Xavier? " + newStringList.contains("Xavier"));



// ********* isEmpty() & size() *********

/*
* syntax:
boolean isEmpty()
int size()
*/

System.out.println(newStringList); // [Xavier, Duriraj]
System.out.println(newStringList.isEmpty()); // false
System.out.println(newStringList.size()); // 2


// ******* clear() *******

/*
* syntax:
void clear()
*/

// System.out.println(newStringList.clear()); // returns void
newStringList.clear(); 
System.out.println(newStringList.isEmpty()); // true
System.out.println(newStringList.size()); // 0


// ******* equals() **********

ArrayList<Integer> classStrengh2019 = new ArrayList<>();
ArrayList<Integer> classStrengh2020 = new ArrayList<>();
System.out.println(classStrengh2019.equals(classStrengh2020)); // true


ArrayList<Integer> newClassStrengh2019 = new ArrayList<>();
ArrayList<Integer> newClassStrengh2020 = new ArrayList<>();
newClassStrengh2019.add(100);
System.out.println(newClassStrengh2019.equals(newClassStrengh2020)); // false

ArrayList<Integer> empCount = new ArrayList<>();
ArrayList<Integer> projectCount = empCount;
System.out.println(empCount.equals(projectCount)); // true


ArrayList<Integer> newEmpCount = new ArrayList<>();
ArrayList<Integer> newProjectCount = newEmpCount;
newEmpCount.add(500);
System.out.println(newEmpCount.equals(newProjectCount));
System.out.println(newEmpCount);
System.out.println(newProjectCount);


//  check if it allows duplicates
// check the index of a value





}
}