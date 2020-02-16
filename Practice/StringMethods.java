class StringMethods{


public static void main(String []args){

String name = "Xavier";
System.out.println(name.startsWith("Xa"));
System.out.println(name.startsWith(""));
System.out.println(name.endsWith(""));

System.out.println(name.replace("er","a"));
System.out.println(name);



//trim()

String jumple = "\t  Man\tg o \r o\t     ";

System.out.println(jumple.trim());


}


}