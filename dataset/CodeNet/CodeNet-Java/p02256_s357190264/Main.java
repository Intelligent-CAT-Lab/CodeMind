import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
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
