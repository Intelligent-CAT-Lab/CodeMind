import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int[] X = new int[3];
		
var newVariable_0 = keyboard.nextInt();		X[0] = newVariable_0;
var newVariable_1 = keyboard.nextInt();		X[1] = newVariable_1;
var newVariable_2 = keyboard.nextInt();		X[2] = newVariable_2;
		
		Arrays.sort(X);
		
		System.out.println(X[0]+ X[1]);
		keyboard.close();	
	}
}
