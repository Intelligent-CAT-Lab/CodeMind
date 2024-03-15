<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

mod = 1000000007
memo = [0] * 9

def make_memo():
    memo[0] = memo[1] = 1
    for i in range(2, 9):
        for bit in range(1 << (i - 2)):
            before = 0
            for j in range(9):
                now = (bit >> j & 1)
                if before == 1 and now == 1:
                    break
                before = now
            memo[i] += memo[j]

def solve(H, W, K):
    dp = [[0] * (W + 1) for _ in range(H + 1)]
    dp[0][0] = 1
    for h in range(1, H + 1):
        for w in range(1, W + 1):
            # down
            if w < W:
                dp[h][w + 1] += dp[h - 1][w] * memo[w] % mod * memo[(W - 1) - (w + 1)] % mod
                dp[h][w + 1] %= mod
            # left
            if w > 0:
                dp[h][w - 1] += dp[h - 1][w] * memo[w - 1] % mod * memo[(W - 1) - w] % mod
                dp[h][w - 1] %= mod
            # up
            dp[h][w] += dp[h - 1][w] * memo[w] % mod * memo[(W - 1) - w] % mod
            dp[h][w] %= mod
    ans = dp[H][K - 1]
    return ans

if __name__ == "__main__":
    H = int(input())
    W = int(input())
    K = int(input())
    make_memo()
    print(solve(H, W, K))
```</s>
