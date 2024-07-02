import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
System.out.println("[INST]8;N;sc.nextInt();"+N);
		int M = sc.nextInt();
System.out.println("[INST]9;M;sc.nextInt();"+M);
		int R = sc.nextInt();
System.out.println("[INST]10;R;sc.nextInt();"+R);
		R -= N * M;
		if (R < 0) {
			System.out.println(0);
			return;
		}
		BigInteger ans = BigInteger.ONE;
		for (int i = 0; i < N - 1; ++i) {
			ans = ans.multiply(BigInteger.valueOf(R + N - 1 - i)).divide(BigInteger.valueOf(i + 1));
System.out.println("[INST]18;ans;ans.multiply(BigInteger.valueOf(R + N - 1 - i)).divide(BigInteger.valueOf(i + 1));"+ans);
System.out.println("[INST]18;None;ans.multiply(BigInteger.valueOf(R + N - 1 - i));"+ans.multiply(BigInteger.valueOf(R + N - 1 - i)));
System.out.println("[INST]18;None;BigInteger.valueOf(R + N - 1 - i);"+BigInteger.valueOf(R + N - 1 - i));
System.out.println("[INST]18;None;BigInteger.valueOf(i + 1);"+BigInteger.valueOf(i + 1));
		}
		System.out.println(ans);
	}
}