<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
import math

def solve(n, m):
    dp = [1] + [0] * n
    for j in range(1, n + 1):
        for i in range(1, min(m, j) + 1):
            dp[j] += dp[j - i] / j
    return dp[n]

n = int(input())
m = int(input())
print(solve(n, m))
```
This is a Python implementation of the Java code you provided. It uses the same algorithm to calculate the result, but it is written in a more Pythonic way.

The `solve` function takes `n` and `m` as input, and it returns the result of the calculation. The function first initializes an array `dp` with a single element set to 1, and then it iterates over the range of `j` from 1 to `n + 1`. For each value of `j`, it iterates over the range of `i` from 1 to `min(m, j) + 1`, and it updates the value of `dp[j]` using the formula from the Java code. Finally, it returns the value of `dp[n]`.

The `main` function takes no arguments and it simply calls the `solve` function with the input values `n` and `m`, and it prints the result.

Note that the `min` function is used to ensure that the inner loop only iterates up to `min(m, j)`, to avoid an index out of range error.</s>
