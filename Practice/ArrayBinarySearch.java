/*
*  Arrays class helps to search a value in array
*/

class ArrayBinarySearch{

public static void main(String[] args){

int[] numbers = {10,1,100};

java.util.Arrays.sort(numbers);


System.out.println(java.util.Arrays.binarySearch(numbers, 10));


}

}