import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int[] X = new int[3];
		
		X[0] = keyboard.nextInt();
System.out.println("[INST]10;None;keyboard.nextInt();"+keyboard.nextInt());
		X[1] = keyboard.nextInt();
System.out.println("[INST]11;None;keyboard.nextInt();"+keyboard.nextInt());
		X[2] = keyboard.nextInt();
System.out.println("[INST]12;None;keyboard.nextInt();"+keyboard.nextInt());
		
		Arrays.sort(X);
System.out.println("[INST]14;None;Arrays.sort(X);"+Arrays.sort(X));
		
		System.out.println(X[0]+ X[1]);
		keyboard.close();	
	}
}
