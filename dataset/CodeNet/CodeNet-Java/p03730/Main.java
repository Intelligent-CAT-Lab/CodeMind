import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
