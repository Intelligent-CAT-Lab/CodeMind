<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import sys

def count_pairs(n):
    cnt = 0
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i * j < n:
                cnt += 1
            else:
                break
    return cnt

n = int(sys.stdin.readline())
print(count_pairs(n))
```

In this Python code, we define a function `count_pairs(n)` that counts the number of pairs `(i, j)` such that `i * j < n`. We then read the input `n` from `sys.stdin` and print the result of `count_pairs(n)`.
<|EOT|>
