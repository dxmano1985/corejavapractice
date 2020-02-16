package practice;
import java.util.Random;

public class RandomUtil{

public void printRandomNumber(int anynumber){

Random rand = new Random();

System.out.println(rand.nextInt(anynumber));
}

}