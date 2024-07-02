import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
System.out.println("[INST]5;K;sc.nextInt();"+K);
		int X = sc.nextInt();
System.out.println("[INST]6;X;sc.nextInt();"+X);

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}
