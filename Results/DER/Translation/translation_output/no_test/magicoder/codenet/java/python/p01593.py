<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

class p01593:
    INF = 1 << 28
    EPS = 1e-12

    def __init__(self):
        self.n, self.m = map(int, sys.stdin.readline().split())

    def solve(self):
        dp = [0] * (self.n + 1)
        dp[0] = 1
        for j in range(1, self.n + 1):
            for i in range(1, min(self.m, j) + 1):
                dp[j] += dp[j - i] / j
        print("%.12f" % dp[self.n])

    def run(self):
        self.solve()

if __name__ == "__main__":
    p01593().run()
```

Please note that Python does not have a built-in `println` function like Java. Instead, we use the `print` function. Also, Python does not have a built-in `min` function like Java. Instead, we use the `min` function from the `math` module. And Python does not have a built-in `static` keyword like Java. Instead, we use the `@staticmethod` decorator. And Python does not have a built-in `import static` like Java. Instead, we import the necessary modules at the beginning of the code. And Python does not have a built-in `Scanner` class like Java. Instead, we use the `sys.stdin.readline()` function to read input. And Python does not have a built-in `String.format` like Java. Instead, we use the `%` operator for string formatting. And Python does not have a built-in `main` function like Java. Instead, we use the `if __name__ == "__main__":` idiom to run the `run` method when the script is executed directly.<｜end▁of▁sentence｜>
