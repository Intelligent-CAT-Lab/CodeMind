<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

class p01593:
    def __init__(self):
        self.sc = sys.stdin
        self.INF = 1 << 28
        self.EPS = 1e-12

    def run(self):
        self.n = int(self.sc.readline().strip())
        self.m = int(self.sc.readline().strip())
        self.solve()

    def solve(self):
        dp = [0.0]*(self.n+1)
        dp[0] = 1
        for j in range(1, self.n+1):
            for i in range(1, min(self.m, j)+1):
                dp[j] += dp[j-i]/j
        self.println("{:.12f}".format(dp[self.n]))

    def println(self, s):
        print(s)

if __name__ == "__main__":
    p01593().run()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the sum of the probabilities of the number of heads in n tosses being less than or equal to m, and prints the result. The result is formatted to 12 decimal places.
<|EOT|>
