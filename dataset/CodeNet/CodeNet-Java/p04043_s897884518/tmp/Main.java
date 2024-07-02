import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int SideA = keyboard.nextInt();
System.out.println("[INST]8;SideA;keyboard.nextInt();"+SideA);
		int SideB = keyboard.nextInt();
System.out.println("[INST]9;SideB;keyboard.nextInt();"+SideB);
		int SideC = keyboard.nextInt();
System.out.println("[INST]10;SideC;keyboard.nextInt();"+SideC);
		
		int[] arr = new int[] {SideA, SideB, SideC};
		Arrays.sort(arr);
System.out.println("[INST]13;None;Arrays.sort(arr);"+Arrays.sort(arr));
		
		if (arr[0] == 5  && arr[1] == 5 && arr[2] == 7) {
				System.out.println("YES");					
			}else {
			System.out.println("NO");
		}	
		keyboard.close();	
	}
}