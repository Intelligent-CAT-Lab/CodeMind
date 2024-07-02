import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
System.out.println("[INST]6;T;scanner.nextInt();"+T);
		int X = scanner.nextInt();
System.out.println("[INST]7;X;scanner.nextInt();"+X);
		scanner.close();
		double ans = (double) T / (double) X;
		System.out.println(String.format("%.10f", ans));
	}
}