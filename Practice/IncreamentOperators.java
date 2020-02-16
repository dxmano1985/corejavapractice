/*
Increament Operator : ++
Decreament Operator : --

*/
class IncreamentOperators{

public static void main(String[] args){

int i = 1;
int j = 1;
 
System.out.println(i++); // 1   
System.out.println(++i); // 3

System.out.println(++j); // 2



int counter = 0;
System.out.println(counter); // Outputs 0
System.out.println(++counter); // Outputs 1
System.out.println(counter); // Outputs 1
System.out.println(counter--); // Outputs 1
System.out.println(counter); // Outputs 0


int a = 0;

a = a++;

System.out.println("a=" + a );


// infinite loop. b = b++ 
for(int b = 0; b <  5; b = b++){
System.out.println("b=" + b );
}


}

}