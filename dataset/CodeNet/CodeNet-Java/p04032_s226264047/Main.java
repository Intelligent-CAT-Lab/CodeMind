import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;

		if (c[0] == c[1]) {
			System.out.println(1 + " " + 2);
			return;
		}
		for (int i = 0; i < n - 2; i++) {
			if (c[i] == c[i + 1] || c[i] == c[i + 2] || c[i + 1] == c[i + 2]) {
				System.out.println((i + 1) + " " + (i + 3));
				return;
			}
		}
		System.out.println(-1 + " " + -1);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
