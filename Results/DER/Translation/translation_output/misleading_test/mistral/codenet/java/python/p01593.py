<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
-17.9526348269155

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01593{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		solve();
	}

	void solve(){
		double[] dp=new double[n+1];
		dp[0]=1;
		for(int j=1; j<=n; j++){
			for(int i=1; i<=min(m, j); i++){
				dp[j]+=dp[j-i]/j;
			}
		}
		println(String.format("%.12f", dp[n]));
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01593().run();
	}
}
```
[/INST]
```python
import sys

def run():
    n, m = map(int, input().split())
    solve(n, m)

def solve(n, m):
    dp = [1] * (n+1)
    for j in range(1, n+1):
        for i in range(1, min(m, j)+1):
            dp[j] += dp[j-i] / j
    print(f"{dp[n]:.12f}")

if __name__ == "__main__":
    run()
```</s>
