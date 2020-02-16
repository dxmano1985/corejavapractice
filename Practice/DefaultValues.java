class DefaultValues{

byte byteVar;
short shortVar;
int intVar;
long longVar;
float floatVar;
double doubleVar;
boolean booleanVar;
char charVar;
String s1;

static DefaultValues defVal1;
public static void main(String []any){
DefaultValues defVal = new DefaultValues();

System.out.println(defVal.byteVar);
System.out.println(defVal.shortVar);
System.out.println(defVal.intVar);
System.out.println(defVal.longVar);
System.out.println(defVal.floatVar);
System.out.println(defVal.doubleVar);
System.out.println(defVal.booleanVar);
System.out.println(defVal.charVar);
System.out.println(defVal.s1);
System.out.println(defVal);
System.out.println(defVal1);

}


}