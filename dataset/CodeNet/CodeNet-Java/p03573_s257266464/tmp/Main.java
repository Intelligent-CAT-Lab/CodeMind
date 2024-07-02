import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
System.out.println("[INST]5;a;scan.nextInt();"+a);
		int b = scan.nextInt();
System.out.println("[INST]6;b;scan.nextInt();"+b);
		int c = scan.nextInt();
System.out.println("[INST]7;c;scan.nextInt();"+c);
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
