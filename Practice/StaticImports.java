/*
* Example for static import
* Syntax: static import <static member of any class> 
* How static imports can be used for importing and using constants from another class.
*/

package practice;

import java.util.Arrays;
import static java.util.Arrays.asList;
//static import java.util.Arrays.asList; //illegal. order cannot be changed

import static practice.AppConstants.*;

class StaticImports{

String[] numbers = {"One", "Two"};

public StaticImports(){
Arrays.asList(numbers); //legal. not neccessary to use Arrays here
asList("Three", "Four"); //legal
}


public static void main(String[] args){

System.out.println(URL); // print the url
System.out.println(USERNAME); // print the USERNAME
}

}