
import java.io.IOException;
import java.util.Scanner;

public class p00280 {

	public static void main(String[] args) throws IOException {

		new p00280().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		slove(0, 0, "");
	}

	private void slove(int x, int y, String s) {
		if ((x == 5 && y < b && y != 4) || y == 5 && x < a && x != 4)
			return;
		if (x == a + 1 || y == b + 1)
			return;
		if (x == a && y == b)
			System.out.println(s);
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				slove(x + 1, y, s + "A");
			} else
				slove(x, y + 1, s + "B");
		}
	}

	int a, b;
}