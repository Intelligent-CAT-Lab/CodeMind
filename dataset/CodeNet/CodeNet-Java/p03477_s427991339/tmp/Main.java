import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]5;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]6;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]7;c;sc.nextInt();"+c);
		int d = sc.nextInt();
System.out.println("[INST]8;d;sc.nextInt();"+d);
		if(a + b > c + d) {
			System.out.println("Left");
		} else if(a + b == c + d) {
			System.out.println("Balanced");
		} else if(a + b < c + d) {
			System.out.println("Right");
		}
	}
}
