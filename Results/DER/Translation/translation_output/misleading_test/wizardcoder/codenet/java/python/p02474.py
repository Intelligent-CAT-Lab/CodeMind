Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

class p02474:

    BIG_NUM = 2000000000
    MOD = 1000000007

    def main(self):
        input = sys.stdin.readline().split()
        A = int(input[0])
        B = int(input[1])

        ans = A * B
        print(ans)

if __name__ == '__main__':
    p02474().main()
```

Explanation:

- We import the `sys` module to read input from the command line.
- We define a class `p02474` which contains the `main` method.
- We define the constants `BIG_NUM` and `MOD` which are used in the solution.
- In the `main` method, we read the input from the command line using `sys.stdin.readline()` and split it using `split()` method.
- We convert the input strings to integers using `int()` method.
- We calculate the product of `A` and `B` using the `*` operator.
- We print the result using the `print()` function.<|endoftext|>
