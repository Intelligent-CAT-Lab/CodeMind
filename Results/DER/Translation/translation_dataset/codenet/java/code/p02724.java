import java.util.Scanner;

public class p02724 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			int gohyaku = X/500;
			
			X = X-500*gohyaku;
			
			int goen = X/5;
			
			
			System.out.println(1000*gohyaku+5*goen);
		}
		
		
	}
		

}
