/*
* Can you add null to Integer List or any List - Yes
* Can you get null value of Integer List and assign to int - nullpointerException 
*/

import java.util.List;
import java.util.ArrayList;

class ListAddNull{

public static void main(String[] args){

List<Integer> ages = new ArrayList<>();
ages.add(null);
int age = ages.get(0);
//System.out.println("Autoboxed null to int value: " + age);
}

}