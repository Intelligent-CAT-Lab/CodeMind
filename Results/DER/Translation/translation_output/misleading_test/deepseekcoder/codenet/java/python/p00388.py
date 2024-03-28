<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 2 4

Expected output:
97

```
import java.util.Scanner;

/**
 * Design of a Mansion
 */
public class p00388 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H, A, B;
		H = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();

		int ans = 0;

		for (int i = A; i <= B; i++) {
			if (H % i == 0) ans++;
		}

		System.out.println(ans);
	}
}


```

### Response:
```python
import sys

def main():
    H, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(A, B+1):
        if H % i == 0:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The `range()` function is used in the for loop to iterate from A to B (inclusive). If H is divisible by i, we increment the `ans` variable. Finally, we print the value of `ans`.
<|EOT|>
