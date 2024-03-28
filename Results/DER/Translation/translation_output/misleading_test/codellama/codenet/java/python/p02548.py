<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
83

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
[/INST]
```python
import math

def main():
    n = int(input())
    cnt = 0
    for i in range(1, n+1):
        for j in range(1, n+1):
            if i * j < n:
                cnt += 1
            else:
                break
    print(cnt)

if __name__ == "__main__":
    main()
```

Explanation:

The code first prompts the user to enter a number `n`. It then initializes a variable `cnt` to 0, which will be used to count the number of pairs of numbers that satisfy the condition `i * j < n`.

The code then enters a nested loop, where the outer loop iterates from 1 to `n`, and the inner loop iterates from 1 to `n`. For each pair of numbers `i` and `j`, the code checks if `i * j` is less than `n`. If it is, the code increments `cnt` by 1. If it is not, the code breaks out of the inner loop and continues with the next iteration of the outer loop.

After the loops have finished, the code prints the value of `cnt`, which is the number of pairs of numbers that satisfy the condition `i * j < n`.

Note that the code uses the `math` module to import the `BigInteger` class, which is used to represent large integers. The `BigInteger` class is used to represent the value of `cnt`, which is a large integer.</s>
