import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		BigInteger cnt = BigInteger.ZERO;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i * j < n) {
					cnt = cnt.add(BigInteger.ONE);
System.out.println("[INST]12;cnt;cnt.add(BigInteger.ONE);"+cnt);
				} else {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
