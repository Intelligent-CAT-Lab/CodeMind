
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		System.out.println((b-a)*(b-a+1)/2-b);
	}
	
}
