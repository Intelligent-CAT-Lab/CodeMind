Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

class p01593:
    def __init__(self):
        self.sc = Scanner(System.in)

    def run(self):
        n = self.sc.nextInt()
        m = self.sc.nextInt()
        self.solve(n, m)

    def solve(self, n, m):
        dp = [0] * (n+1)
        dp[0] = 1
        for j in range(1, n+1):
            for i in range(1, min(m, j)+1):
                dp[j] += dp[j-i] / j
        self.println(str(dp[n]))

    def println(self, s):
        print(s)

p01593().run()
```

Explanation:

- We import the `math` module to use the `sqrt` function.
- We define a class `p01593` which has a constructor to initialize the `Scanner` object.
- We define a `run` method which reads the input values, calls the `solve` method and prints the output.
- We define a `solve` method which initializes an array `dp` of size `n+1` and sets the first element to 1. We then iterate over all values of `j` from 1 to `n` and for each value of `j`, we iterate over all values of `i` from 1 to `min(m, j)` and update the value of `dp[j]` by adding the value of `dp[j-i]` divided by `j`.
- We define a `println` method which prints the given string.
- We call the `run` method of the `p01593` class to run the program.<|endoftext|>
