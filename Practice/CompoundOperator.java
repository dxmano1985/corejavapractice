class CompoundOperator{
public static void main(String[] any){
short x = 32767;
short y = 1;
//short z =  x + y;  // error: incompatible types: possible lossy conversion from int to short
short z = (short)(x+y);
short z1 = (short) 1113478;

short a = 3;
//a = a * 2; //error: incompatible types: possible lossy conversion from int to short
a *= 2;   // works. compound operators takes care of implicit casting (int to short here)

System.out.println("Value of z: " + z);
System.out.println("Value of z1: " + z1);

System.out.println("Value of a: " + a);



}
}