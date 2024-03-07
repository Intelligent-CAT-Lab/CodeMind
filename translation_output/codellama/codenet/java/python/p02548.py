<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import math

n = int(input("Enter a number: "))
cnt = 0
for i in range(1, n+1):
    for j in range(1, n+1):
        if i * j < n:
            cnt += 1
        else:
            break
print(cnt)
```
This code is similar to the Java code, but it uses Python's built-in `input()` function to get the user input, and it uses Python's `range()` function to iterate over the numbers from 1 to `n`. The `cnt` variable is initialized to 0, and it is incremented by 1 for each pair of numbers `i` and `j` that satisfy the condition `i * j < n`. Finally, the `print()` function is used to output the value of `cnt`.</s>
