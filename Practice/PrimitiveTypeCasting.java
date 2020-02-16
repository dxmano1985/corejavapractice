class PrimitiveTypeCasting{
public static void main(String[] args){


// integral values
byte by = 5;
int in = 100;

int in1 = by;
short sh = by;
long lo = by;
long lo1 = in;
int in2 = (int)lo1;


//floating

float f1 = by;
byte b1 = (byte)f1;

float f2 = 10.5f;
byte b2= (byte)f2;

long l3 = 20;
int i3 = l3 +1;

}
}