<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

n = int(sys.stdin.readline().strip())
print(count_pairs(n))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of pairs `(i, j)` such that `i * j < n`, and prints the count. The `count_pairs` function does the counting, and the main part of the program reads the input and prints the result.
<|EOT|>
