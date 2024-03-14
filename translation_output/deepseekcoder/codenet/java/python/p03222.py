<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

mod = int(1e9+7)
memo = [0]*9

def make_memo():
    memo[0]=1
    memo[1]=1
    for i in range(2,9):
        for bit in range(2<<(i-2)):
            before = 0
            for j in range(9):
                now = (bit>>j)&1
                if before==1 and now==1: break
                before = now
                if j==8: memo[i]+=1

def solve():
    H, W, K = map(int, sys.stdin.readline().split())
    make_memo()
    dp = [[0]*W for _ in range(H+1)]
    dp[0][0]=1
    for h in range(H):
        for w in range(W):
            if w+1<W:
                dp[h+1][w+1]+=dp[h][w]*memo[w]%mod*memo[(W-1)-(w+1)]%mod
                dp[h+1][w+1]%=mod
            if w-1>=0:
                dp[h+1][w-1]+=dp[h][w]*memo[w-1]%mod*memo[(W-1)-w]%mod
                dp[h+1][w-1]%=mod
            dp[h+1][w] += dp[h][w]*memo[w]%mod*memo[(W-1)-w]%mod
            dp[h+1][w]%=mod
    print(dp[H][K-1])

solve()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the number of ways to arrange the columns of a grid of size H x W with K columns occupied, and prints the result. The calculation is done using dynamic programming and memoization to avoid redundant calculations. The modulo operation is used to ensure that the result fits within the limits of a 32-bit integer.
<|EOT|>
