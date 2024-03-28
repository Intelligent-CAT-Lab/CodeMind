<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


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

@@ Response
```python
import sys

def main():
    try:
        A, B = map(int, sys.stdin.readline().split())
        ans = A * B
        print(ans)
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, multiplies them together, and prints the result. If an error occurs during the input reading or the multiplication, it prints the error message.<｜end▁of▁sentence｜>
