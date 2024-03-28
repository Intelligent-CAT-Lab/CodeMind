<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
134

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p02474 {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input[] = br.readLine().split("\\s+");

			BigInteger A = new BigInteger(input[0]);
			BigInteger B = new BigInteger(input[1]);

			BigInteger ans;

			ans = A.multiply(B);
			System.out.println(ans);

		} catch (IOException e) {
			// TODO èªåçæããã catch ãã­ãã¯
			e.printStackTrace();
		}
	}
}



```

### Response:
```python
import sys

def solve(A, B):
    return (A * B) % (10**9 + 7)

if __name__ == "__main__":
    A, B = map(int, sys.stdin.readline().split())
    print(solve(A, B))
```

In this Python code, we use the built-in `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input strings to integers. The `solve()` function calculates the product of A and B, and returns the result modulo `10**9 + 7` to prevent overflow.
<|EOT|>
