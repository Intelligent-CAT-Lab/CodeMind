import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();
		int b3 = scan.nextInt();
		if(b1 == 1 && b2 == 0 && b3 == 0 || b1 == 0 && b2 == 1 && b3 == 0 || b1 == 0 && b2 == 0 && b3 == 0){
			System.out.println("Close");
		} else {
			if(b1 == 1 && b2 == 1 && b3 == 0 || b1 == 0 && b2 == 0 && b3 == 1){
				System.out.println("Open");
			}
		}
	}
}