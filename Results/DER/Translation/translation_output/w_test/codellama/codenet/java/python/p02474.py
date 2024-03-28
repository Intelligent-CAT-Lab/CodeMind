<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    ans = A * B
    print(ans)

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin, and the `map` function is used to convert the input strings to integers. The `int` function is used to convert the input strings to integers. The `print` function is used to print the result to stdout.</s>
