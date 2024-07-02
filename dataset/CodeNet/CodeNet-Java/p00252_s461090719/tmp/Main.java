import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b1 = scan.nextInt();
System.out.println("[INST]5;b1;scan.nextInt();"+b1);
		int b2 = scan.nextInt();
System.out.println("[INST]6;b2;scan.nextInt();"+b2);
		int b3 = scan.nextInt();
System.out.println("[INST]7;b3;scan.nextInt();"+b3);
		if(b1 == 1 && b2 == 0 && b3 == 0 || b1 == 0 && b2 == 1 && b3 == 0 || b1 == 0 && b2 == 0 && b3 == 0){
			System.out.println("Close");
		} else {
			if(b1 == 1 && b2 == 1 && b3 == 0 || b1 == 0 && b2 == 0 && b3 == 1){
				System.out.println("Open");
			}
		}
	}
}