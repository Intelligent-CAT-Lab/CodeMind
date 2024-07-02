import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
System.out.println("[INST]5;T;sc.nextInt();"+T);
		int X = sc.nextInt();
System.out.println("[INST]6;X;sc.nextInt();"+X);
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}
