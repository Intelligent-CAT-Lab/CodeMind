<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

class p01593:
	def __init__(self):
		self.sc = sys.stdin
		self.INF = 1<<28
		self.EPS = 1e-12
		self.n = 0
		self.m = 0

	def run(self):
		self.n = int(self.sc.readline())
		self.m = int(self.sc.readline())
		self.solve()

	def solve(self):
		dp = [0.0 for i in range(self.n+1)]
		dp[0] = 1.0
		for j in range(1, self.n+1):
			for i in range(1, min(self.m, j)+1):
				dp[j] += dp[j-i]/j
		print("%.12f" % dp[self.n])

	def println(self, s):
		print(s)

	def main(self):
		self.run()

if __name__ == "__main__":
	p01593().main()
```
<|endoftext|>
