import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int l, k;
	long[] dp;
	void run() {
		Scanner scan = new Scanner(System.in);
		l = scan.nextInt();
System.out.println("[INST]8;l;scan.nextInt();"+l);
		k = scan.nextInt();
System.out.println("[INST]9;k;scan.nextInt();"+k);
		dp = new long[l+1];
		System.out.println(dfs(l));
	}
	long dfs(int d) {
//		System.out.println("l: " + d + " " +Arrays.toString(dp));
		if (l == d) return dfs(d - 1) + dfs(d - k);
		if (d < 0) return 0;
		if (d < 2) return 1;
		if (dp[d] != 0)
			return dp[d];
		dp[d] = dfs(d - 2) + dfs(d - k - 1) + 1;
		return dp[d];
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

