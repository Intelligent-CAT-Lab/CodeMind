<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
0.50000000


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

@@ Response
```python
import sys

def solve(n, m):
    dp = [0.0] * (n + 1)
    dp[0] = 1.0
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

def main():
    n, m = map(int, sys.stdin.readline().split())
    print("%.12f" % solve(n, m))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calls the `solve` function with these integers, and then prints the result. The `solve` function calculates the probability of getting exactly `n` heads when flipping a coin `n` times, where each flip has `m` possible outcomes. The result is printed with 12 decimal places.<｜end▁of▁sentence｜>
