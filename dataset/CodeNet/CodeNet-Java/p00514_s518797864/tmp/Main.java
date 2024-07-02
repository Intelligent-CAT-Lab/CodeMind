
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
System.out.println("[INST]14;n;scanner.nextInt();"+n);
		int m = scanner.nextInt();
System.out.println("[INST]15;m;scanner.nextInt();"+m);
		int r = scanner.nextInt();
System.out.println("[INST]16;r;scanner.nextInt();"+r);
		r -= n * m;
		if (r < 0) {
			System.out.println(0);
			return;
		}
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < n-1; i++)
			ans = ans.multiply(BigInteger.valueOf(r + n - 1 - i)).divide(
System.out.println("[INST]24;ans;ans.multiply(BigInteger.valueOf(r + n - 1 - i)).divide(
					BigInteger.valueOf(i + 1));"+ans);
System.out.println("[INST]24;None;ans.multiply(BigInteger.valueOf(r + n - 1 - i));"+ans.multiply(BigInteger.valueOf(r + n - 1 - i)));
System.out.println("[INST]24;None;BigInteger.valueOf(r + n - 1 - i);"+BigInteger.valueOf(r + n - 1 - i));
					BigInteger.valueOf(i + 1));
System.out.println("[INST]25;None;BigInteger.valueOf(i + 1);"+BigInteger.valueOf(i + 1));
		System.out.println(ans);
	}
}