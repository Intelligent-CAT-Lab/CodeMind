import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int SideA = keyboard.nextInt();
		int SideB = keyboard.nextInt();
		int SideC = keyboard.nextInt();
		
		int[] arr = new int[] {SideA, SideB, SideC};
		Arrays.sort(arr);
		
		if (arr[0] == 5  && arr[1] == 5 && arr[2] == 7) {
				System.out.println("YES");					
			}else {
			System.out.println("NO");
		}	
		keyboard.close();	
	}
}