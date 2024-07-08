import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a==b) {
			System.out.println(c);
		}
		if (b == c) {
			System.out.println(a);
		}
		if (c==a) {
			System.out.println(b);
		}
		System.out.println("");
	}
}
