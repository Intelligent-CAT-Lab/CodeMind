import java.util.Arrays;
import java.util.Scanner;

/* 参考:　貰う DP と配る DP、メモ化再帰、個数制限なしナップサック問題 @drken https://qiita.com/drken/items/ace3142967c4f01d42e9#%E8%A7%A3%E6%B3%95-1-1-%E3%83%88%E3%83%83%E3%83%97%E3%83%80%E3%82%A6%E3%83%B3%E3%81%AB-n-%E3%82%92%E9%99%8D%E4%B8%8B%E3%81%97%E3%81%A6%E3%81%84%E3%81%8F%E3%83%A1%E3%83%A2%E5%8C%96%E5%86%8D%E5%B8%B0 */

public class Main {
	static final int MAX_N = 110000;
	static int[] memo = new int[MAX_N]; // memo[i]:i=Nのときの最低値
	static {
		Arrays.fill(memo, -1); // 初期化
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = calc(n);
		System.out.println(ans);
	}

	static int calc(int n) {
		if (n == 0) return 0;
		if (memo[n] != -1) return memo[n]; // メモ済みならその値を返す

		int res = n; // 1円ずつ引き出した場合 resはresponseのres?
		for (int pow6 = 1; pow6 <= n; pow6 *= 6) {
			res = Math.min(res, calc(n - pow6) + 1); // resとnを間違えていた
		}
		for (int pow9 = 1; pow9 <= n; pow9 *= 9) {
			res = Math.min(res, calc(n - pow9) + 1);
		}
		memo[n] = res;
		return memo[n];
	}
}