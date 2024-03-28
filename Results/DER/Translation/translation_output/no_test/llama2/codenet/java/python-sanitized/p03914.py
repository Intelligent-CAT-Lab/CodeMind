dp[1][0] = 1;
for(int i=0;i<m;i++) {
	long[][] next = new long[n+1][n+1];
	for(int a=0;a<=n;a++) {
		for(int b=0;b<=n;b++) {
			if (dp[a][b] == 0) continue;
			next[a+b][0] = (next[a+b][0] + dp[a][b] * a) % MOD;
			next[a][b+1] = (next[a][b+1] + dp[a][b] * (n-a-b)) % MOD;
			next[a][b] = (next[a][b] + dp[a][b] * b) % MOD;
		}
	}
	dp = next;
}