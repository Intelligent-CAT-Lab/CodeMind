import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}
