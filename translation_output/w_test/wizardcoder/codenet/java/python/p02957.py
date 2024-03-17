Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 16

Expected output:
9


```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p02957 {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		long k = a + b;
		if (k % 2 == 0)
			System.out.println(k / 2);
		else
			System.out.println("IMPOSSIBLE");
		in.close();
	}
}

```

### Response:
```python
import sys

a, b = map(int, sys.stdin.readline().split())
k = a + b

if k % 2 == 0:
    print(k // 2)
else:
    print("IMPOSSIBLE")
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We read the input values of `a` and `b` using `map(int, sys.stdin.readline().split())`.
- We calculate the sum of `a` and `b` and store it in the variable `k`.
- We check if `k` is even or odd using the modulo operator `%`. If `k` is even, we print `k // 2` which is the integer division of `k` by 2. If `k` is odd, we print `"IMPOSSIBLE"`.<|endoftext|>
