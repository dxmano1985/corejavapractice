class PrimitiveTypes{

//boolean

boolean result = true;

//char

char bloodgroup = 'A';

// integral values

int noOfCars;

int populationCount = 1000000000;

byte numberOfBrothers = 2;

short monthlySalary = 30000;

long annualBudget = 1000000000000L;


// floating values


// float
float priceOfBeer = 10.99f;
float price = 10;  // valid as it doesn't have decimal value.

// float - invalid assignment;
// if float value has decimal then the value should be suffixed with 'f' else it will be assumed as double. The below line will throw compile error
// error: incompatible types: possible lossy conversion from double to float
// float newPrice = 1.2; 

     

// double

double avgMonthlySalary = 548659485.324998;



public static void main(String []args){
System.out.println("primitive types examples");

System.out.println("int max value: " + Integer.MAX_VALUE);

System.out.println("int min value: " + Integer.MIN_VALUE);

System.out.println("float min value: " + Float.MIN_VALUE);
System.out.println("float max value: " + Float.MAX_VALUE);


System.out.println("Long min value: " + Long.MIN_VALUE);
System.out.println("Long max value: " + Long.MAX_VALUE);


PrimitiveTypes pt = new PrimitiveTypes();
System.out.println(pt.noOfCars);

}

}