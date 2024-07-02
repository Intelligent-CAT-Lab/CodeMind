import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
System.out.println("[INST]5;x;in.nextInt();"+x);
		int y = in.nextInt();
System.out.println("[INST]6;y;in.nextInt();"+y);
		
		Main program = new Main();
		System.out.println(program.gcd(x, y));
	}
	
	public int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x%y);
	}
}
