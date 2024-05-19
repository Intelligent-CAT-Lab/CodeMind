System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 2

Expected output:
1


```
import java.util.*;
public class p03222 {
	
	static int mod = (int)1e9+7;
	static int memo[] = new int[9];
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		makeMemo();
		
		long dp[][] = new long[H+1][W];
		dp[0][0]=1;
		for(int h=0;h<H;h++) {
			for(int w=0;w<W;w++) {
				//å³
				if(w+1<W) {
					dp[h+1][w+1]+=dp[h][w]*memo[w]%mod*memo[(W-1)-(w+1)]%mod;
					dp[h+1][w+1]%=mod;
				}
				//å·¦
				if(w-1>=0) {
					dp[h+1][w-1]+=dp[h][w]*memo[w-1]%mod*memo[(W-1)-w]%mod;
					dp[h+1][w-1]%=mod;
				}
				//ä¸
				dp[h+1][w] += dp[h][w]*memo[w]%mod*memo[(W-1)-w]%mod;
				dp[h+1][w]%=mod;
				
			}
		}
		long ans = dp[H][K-1];
		System.out.println(ans);
	}
	//ç¸¦æ£ã®æ°ãå¼æ°ã«ãã
	static void makeMemo(){	
		memo[0]=1;
		memo[1]=1;
		for(int i=2;i<9;i++) {
			for(int bit = 0;bit<2<<(i-2);bit++) {
				int before = 0;
				for(int j=0;j<9;j++) {
					int now = (bit>>j&1);
					if(before==1&&now==1) break;
					before = now;
					if(j==8)memo[i]++;
				}
			}
		}
		
		
	}
}
```


Answer:
```python
import sys
input = sys.stdin.readline

mod = 10**9 + 7
memo = [1] * 9
for i in range(2, 9):
    for bit in range(2**(i-2)):
        before = 0
        for j in range(9):
            now = (bit >> j) & 1
            if before == 1 and now == 1:
                break
            before = now
            if j == 8:
                memo[i] += 1

h, w, k = map(int, input().split())
dp = [[0] * w for _ in range(h + 1)]
dp[0][0] = 1
for i in range(h):
    for j in range(w):
        # 右
        if j + 1 < w:
            dp[i + 1][j + 1] += dp[i][j] * memo[j] * memo[w - j - 2] % mod
            dp[i + 1][j + 1] %= mod
        # 左
        if j - 1 >= 0:
            dp[i + 1][j - 1] += dp[i][j] * memo[j - 1] * memo[w - j - 1] % mod
            dp[i + 1][j - 1] %= mod
        #  straight
        dp[i + 1][j] += dp[i][j] * memo[j] * memo[w - j - 1] % mod
        dp[i + 1][j] %= mod

print(dp[h][k - 1])
```<|endoftext|>
