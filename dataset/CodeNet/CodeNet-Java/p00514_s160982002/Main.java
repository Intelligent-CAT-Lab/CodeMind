import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		R -= N * M;
		if (R < 0) {
			System.out.println(0);
			return;
		}
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < N - 1; ++i) {
			ans = ans.multiply(BigInteger.valueOf(R + N - 1 - i)).divide(BigInteger.valueOf(i + 1));
		}
		System.out.println(ans);
	}
}