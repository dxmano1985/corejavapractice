class OperatorPrecedence{

public static void main(String[] args){

int x = 3;

int y = 2 * 4 - x++;

System.out.println(y);   // 5 or 6 ? 5
System.out.println(x);  // 6
}

}