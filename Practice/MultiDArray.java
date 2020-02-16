/*
* Understand how multi dimensional array initialized and used
*/

class MultiDArray{

public static void main(String[] args){

// initialize a multi dimensional array

int [][] studentInfo = new int[3][];

studentInfo[0] = new int[2];
studentInfo[1] = new int[1];
studentInfo[1] = new int[5];
studentInfo[2] = new int[3];

studentInfo[0][1] = 55;
for(int i=0;i<studentInfo.length;i++){

for(int j=0; j<studentInfo[i].length;j++)

System.out.print(studentInfo[i][j]+ " ");

System.out.println();
}


for(int[] a: studentInfo){
for(int b:a)
System.out.print(b+" ");
System.out.println();
}


}


}