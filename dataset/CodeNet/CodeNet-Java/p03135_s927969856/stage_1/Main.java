import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int X = scanner.nextInt();
		scanner.close();
		double ans = (double) T / (double) X;
		System.out.println(String.format("%.10f", ans));
	}
}