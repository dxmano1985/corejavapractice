/*
* Two Arrays with same content are equal ??
*/

class ArrayEquality{

public static void main(String[] args){



int classAnoAndStudents[][] = {{10,20}, {2,3}};
int classBnoAndStudents[][] = {{10,20}, {2,3}};

if(classAnoAndStudents == classBnoAndStudents){
System.out.println("Arrays with same content are equal");
}else{
System.out.println("Arrays with same content are NOT equal");
}
}

}