/*
* An array can be converted to List and vice versa using Arrays class.
* However, size of list will be fixed as equal to length of array. you cannot change it.
*/
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class ArrayToList{
public static void main(String[] args){

int[] numbers = {1,2,3};

//System.out.println("Length of numbers array " + numbers.length);

// convert numbers array to List

//ArrayList<Integer> numList =  Arrays.asList(numbers); // wont work
/*
There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method.
*/
int[] ints = {1, 2, 3};
//List<Integer> intList = new ArrayList<Integer>(ints.length);
List<Integer> intList = new ArrayList<Integer>();
for (int i : ints)
{
    intList.add(i);
}
System.out.println("Value of int[] converted as Integer Array using utility method: " + intList);



//Create a List of Integer
List<Integer> list = Arrays.asList(45,34,-56,88,9);
//convert it to Integer Array
Integer[] numlist=list.toArray(new Integer[2]);
System.out.println("Value of List<Integer> converted as Integer[]: " + java.util.Arrays.toString(numlist));

// convert string array to List

String [] names = {"Xavier", "Mano"};
System.out.println("Length of String array " + names.length);

List<String> nameList =Arrays.asList(names);   // It will return List reference so you need the List variable to capture it.
System.out.println("Size of List " + nameList.size());

// Try to add / remove values in list. Will it work ? NO

// nameList.add("Durairaj");  // No compile Error. Run time error: Exception in thread "main" java.lang.UnsupportedOperationException


// Try to change the names array value. what happens to backed List ?

System.out.println(nameList);
names[1] = "Durairaj";
System.out.println(nameList);


// Can you use set() in List ? YES

nameList.set(1,"Mano");
System.out.println(nameList);
System.out.println(names[1]);


// Convert List to Array
List<String> aptNos = new ArrayList<>();
aptNos.add("4");
aptNos.add("qdsa");
aptNos.add("qdsa");
aptNos.add("qdsa");


Object[] obj = aptNos.toArray();
System.out.println("obj Array length: " + obj.length);

//String[] aptNoInt = aptNos.toArray(new String[]); // compile error if no size mentioned
String[] aptNoInt = aptNos.toArray(new String[1]); // size can be less than actual. converted to min required size automatically if the given size is less than actual.
System.out.println("String Array length: " + aptNoInt.length);
System.out.println(aptNoInt[1]);



// using varargs

List<String> varargsList= Arrays.asList("1","dsf","33");
System.out.print(varargsList);

}


}