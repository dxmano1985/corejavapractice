class Varargs{
public static void main(String... any){
findValue(1);
}


static int findValue(int... any){
int value = any;
return value;
}
}