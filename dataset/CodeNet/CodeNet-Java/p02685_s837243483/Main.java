import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		long m = sc.nextLong();
		int k = sc.nextInt();

		long limit = 998244353;
		long[] nextPattern = new long[k + 1];
		long[] colorPattern = new long[k + 1];

		//隣り合わせが k + 1 個ある時の色の組み合わせを算出
		long pattern = 1;
		if (k < n - 1) {
			for (int i = 0; i <= n - k - 2; i++) {
				if (i == 0) {
					pattern = m;
				} else {
					pattern = (pattern * (m - 1)) % limit;
				}
			}
		}
		//1～k個の連続が発生する個数を計算する。
		for (int i = 0; i <= k; i++) {
			//どこが隣り合わせになるかの組み合わせ。
			if (i == 0) {
				nextPattern[i] = 1;
			} else if (i > (n - 1) / 2) {
				nextPattern[i] = nextPattern[n - 1 - i];
			} else {
				//nCr = nC(r - 1) * (n - r) / (r + 1) -> nextPattern[i - 1] * (n - i) / i
				//余りの割り算は、モジュラ逆数を掛ける。
				nextPattern[i] = (((nextPattern[i - 1] * (long) (n - i)) % limit) * (long) modinv(i, (int) limit)) % limit;
				if (nextPattern[i] < 0) {
					nextPattern[i] += limit;
				}
			}

			//色の組み合わせ。
			if (i == 0) {
				if (k == n - 1) {
					colorPattern[k - i] = m;
				} else {
					colorPattern[k - i] = (pattern * (m - 1)) % limit;
				}
			} else {
				colorPattern[k - i] = (colorPattern[k - i + 1] * (m - 1)) % limit;
			}
		}

		long countPattern = 0;
		for (int i = 0; i <= k; i++) {
			countPattern = (countPattern + (nextPattern[i] * colorPattern[i]) % limit) % limit;
		}

		// 出力
		System.out.println(countPattern);
		sc.close();
	}

	//モジュラ逆数
	public static int modinv(int a, int m) {
		int tempA = a;
		int tempB = m;
		int x0 = 1;
		int y0 = 0;
		int x1 = 0;
		int y1 = 1;
		while (tempB != 0) {
			int q = tempA / tempB;
			int temp = tempA;
			tempA = tempB;
			tempB = temp % tempB;
			temp = x0;
			x0 = x1;
			x1 = temp - q * x1;
			temp = y0;
			y0 = y1;
			y1 = temp - q * y1;
		}
		return x0 % m;
	}
}
