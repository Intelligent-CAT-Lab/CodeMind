Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
61


```

import java.util.Scanner;

public class p03088 {
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long [][][][]dp = new long [n+1][5][5][5];
		
		//å·¦ããç¾å¨ã®æ¡æ°ãn-2,n-1,n,çªç®ã®æå­ãããã¤ã
		//0 -> null,1 -> A, 2 -> G,3 -> C, 4 -> T ã®ããã«ãã
		
		// 
		dp[0][0][0][0] = 1L;
		
		for(int i = 1 ; i <= n ;i++) {
			for(int j = 0 ; j < 5 ; j++) {
				for(int k = 0 ; k < 5 ; k++) {
					for(int l = 0 ; l < 5 ; l++) {
						for(int m = 1 ; m < 5 ; m++) {
							if(j == 1 && l == 2 && m == 3) {continue;}
							if(j == 1 && k == 2 && m == 3) {continue;}
							if(k == 1 && l == 2 && m == 3) {continue;}
							if(k == 1 && l == 3 && m == 2) {continue;}
							if(k == 2 && l == 1 && m == 3) {continue;}
							
							dp[i][k][l][m] = (dp[i][k][l][m] + dp[i-1][j][k][l])% mod;
						
						}
					}
				}
			}
		}
		
		
		long ans = 0;
		
		for(int i = 1 ; i < 5 ;i++) {
			for(int j = 1 ; j < 5 ; j++) {
				for(int k = 1 ; k < 5 ; k++) {
					ans = (ans + dp[n][i][j][k])%mod;
				}
			}
		}
	
		System.out.println(ans);
		
	}	
		
}

```

### Response:

```python
import sys

mod = 1000000007

def count(n):
    dp = [[[[0]*5 for _ in range(5)] for _ in range(5)] for _ in range(n+1)]
    dp[0][0][0][0] = 1
    for i in range(1, n+1):
        for j in range(5):
            for k in range(5):
                for l in range(5):
                    for m in range(1, 5):
                        if j == 1 and l == 2 and m == 3:
                            continue
                        if j == 1 and k == 2 and m == 3:
                            continue
                        if k == 1 and l == 2 and m == 3:
                            continue
                        if k == 1 and l == 3 and m == 2:
                            continue
                        if k == 2 and l == 1 and m == 3:
                            continue
                        dp[i][k][l][m] = (dp[i][k][l][m] + dp[i-1][j][k][l]) % mod
    ans = 0
    for i in range(1, 5):
        for j in range(1, 5):
            for k in range(1, 5):
                ans = (ans + dp[n][i][j][k]) % mod
    return ans

if __name__ == '__main__':
    n = int(sys.stdin.readline().strip())
    print(count(n))
```<|endoftext|>
