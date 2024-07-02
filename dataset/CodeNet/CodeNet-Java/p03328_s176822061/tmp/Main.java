
import java.util.Scanner;

public class Main{

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
System.out.println("[INST]7;a;in.nextLong();"+a);
		long b = in.nextLong();
System.out.println("[INST]8;b;in.nextLong();"+b);
		System.out.println((b-a)*(b-a+1)/2-b);
	}
	
}
