/*
* The purpose of this program is to just start using StringBuilder class instead of String.
* StringBuilder is not immutable hence saves memory in the below program
*/


class StringBuilderSample{


public static void main(String[] args){

// Create a String of all alphabets
StringBuilder alphabets =  new StringBuilder();

System.out.println("Before: " + alphabets);

for(char alpha = 'a'; alpha <= 'd' ; alpha++)
alphabets.append(alpha);

System.out.println(alphabets);

// the below section is to undertsand the character value beyond 'z'
char lastLetter = 'z';
System.out.println(++lastLetter);
System.out.println(++lastLetter);
System.out.println(++lastLetter);



}


}
