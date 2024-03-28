<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math
import sys

INF = 1 << 28
EPS = 1e-12

n, m = map(int, input().split())

dp = [1] + [0] * n
for j in range(1, n + 1):
    for i in range(1, min(m, j) + 1):
        dp[j] += dp[j - i] / j

print(f"{dp[n]:.12f}")
```
This is the Python translation of the Java code. It uses the `map` function to read the input as integers, and the `min` function to find the minimum of two numbers. The `f"{dp[n]:.12f}"` format string is used to print the result with 12 decimal places.</s>
