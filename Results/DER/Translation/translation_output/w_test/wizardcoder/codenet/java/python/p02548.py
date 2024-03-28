Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
3


```
import java.math.BigInteger;
import java.util.Scanner;

public class p02548 {
	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger cnt = BigInteger.ZERO;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i * j < n) {
					cnt = cnt.add(BigInteger.ONE);
				} else {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

```

### Response:
```python
import math

n = int(input())
cnt = 0
for i in range(1, n+1):
    for j in range(1, n+1):
        if i*j < n:
            cnt += 1
        else:
            break
print(cnt)
```

Explanation:

- We first import the `math` module to use the `ceil` function which will be used to round up the result of the division.
- We take the input `n` from the user.
- We initialize a variable `cnt` to 0.
- We use two nested loops to iterate over all possible pairs of `i` and `j` such that `i*j < n`.
- If `i*j < n`, we increment the `cnt` variable by 1.
- If `i*j >= n`, we break out of the inner loop since we have already counted all possible pairs of `i` and `j` such that `i*j < n`.
- Finally, we print the value of `cnt`.<|endoftext|>
