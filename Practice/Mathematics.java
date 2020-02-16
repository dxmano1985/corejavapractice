class Mathematics{

public int calcExponentValue(int e, int x){
//calculate e power of x.

int z = e;

for(int i = 1; i<x; i++){

z = z * e;

}

return z;
}

public static void main(String args[]){

Mathematics math = new Mathematics();
System.out.println(math.calcExponentValue(2,16));
}



}