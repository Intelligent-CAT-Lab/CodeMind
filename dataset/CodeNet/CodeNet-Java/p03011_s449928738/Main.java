import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int[] X = new int[3];
		
		X[0] = keyboard.nextInt();
		X[1] = keyboard.nextInt();
		X[2] = keyboard.nextInt();
		
		Arrays.sort(X);
		
		System.out.println(X[0]+ X[1]);
		keyboard.close();	
	}
}
