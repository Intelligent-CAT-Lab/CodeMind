
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int r = scanner.nextInt();
		r -= n * m;
		if (r < 0) {
			System.out.println(0);
			return;
		}
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < n-1; i++)
			ans = ans.multiply(BigInteger.valueOf(r + n - 1 - i)).divide(
					BigInteger.valueOf(i + 1));
		System.out.println(ans);
	}
}