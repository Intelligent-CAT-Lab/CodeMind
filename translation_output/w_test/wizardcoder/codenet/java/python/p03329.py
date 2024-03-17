Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
127

Expected output:
4


```
import java.util.Arrays;
import java.util.Scanner;

/* åè:ãè²°ã DP ã¨éã DPãã¡ã¢ååå¸°ãåæ°å¶éãªãããããµãã¯åé¡ @drken https://qiita.com/drken/items/ace3142967c4f01d42e9#%E8%A7%A3%E6%B3%95-1-1-%E3%83%88%E3%83%83%E3%83%97%E3%83%80%E3%82%A6%E3%83%B3%E3%81%AB-n-%E3%82%92%E9%99%8D%E4%B8%8B%E3%81%97%E3%81%A6%E3%81%84%E3%81%8F%E3%83%A1%E3%83%A2%E5%8C%96%E5%86%8D%E5%B8%B0 */

public class p03329 {
	static final int MAX_N = 110000;
	static int[] memo = new int[MAX_N]; // memo[i]:i=Nã®ã¨ãã®æä½å¤
	static {
		Arrays.fill(memo, -1); // åæå
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = calc(n);
		System.out.println(ans);
	}

	static int calc(int n) {
		if (n == 0) return 0;
		if (memo[n]!= -1) return memo[n]; // ã¡ã¢æ¸ã¿ãªããã®å¤ãè¿ã

		int res = n; // 1åãã¤å¼ãåºããå ´å resã¯responseã®res?
		for (int pow6 = 1; pow6 <= n; pow6 *= 6) {
			res = Math.min(res, calc(n - pow6) + 1); // resã¨nãééãã¦ãã
		}
		for (int pow9 = 1; pow9 <= n; pow9 *= 9) {
			res = Math.min(res, calc(n - pow9) + 1);
		}
		memo[n] = res;
		return memo[n];
	}
}
```

### Response:
Here's the Python code for the given Java code:

```python
import java.util.Arrays;
import java.util.Scanner;

class p03329:
    MAX_N = 110000
    memo = [-1] * MAX_N

    def __init__(self):
        pass

    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        ans = self.calc(n)
        print(ans)

    def calc(self, n):
        if n == 0:
            return 0
        if self.memo[n]!= -1:
            return self.memo[n]

        res = n
        for pow6 in range(1, n+1):
            if pow6 * 6 > n:
                break
            res = min(res, self.calc(n - pow6) + 1)

        for pow9 in range(1, n+1):
            if pow9 * 9 > n:
                break
            res = min(res, self.calc(n - pow9) + 1)

        self.memo[n] = res
        return self.memo[n]

if __name__ == '__main__':
    p03329().main()
```

The main differences between the Java and Python code are:

1. In Python, we need to define a class to encapsulate the code.
2. In Python, we need to define a constructor to initialize the class variables.
3. In Python, we need to define a `main` method to read input and call the `calc` method to compute the answer.
4. In Python, we need to use `self` to refer to the class instance when calling class methods.
5. In Python, we need to use `range` to iterate over the powers of 6 and 9.
6. In Python, we need to use `min` to compute the minimum of two values.
7. In Python, we need to use `break` to exit the loop when we reach the end of the range.
8. In Python, we need to use `print` to output the answer.<|endoftext|>
