import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		long x = Long.min(b - 1, n);
		
		long ans = a * x / b;
		
		System.out.println(ans);
	}
	
}
