<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
Yes


```
import java.util.*;
public class p03285 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
```

### Response:
```python
import sys

def main():
    N = int(sys.stdin.readline().strip())
    limit7 = N // 7
    check = False
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            check = True
    if check:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input from the standard input. The `//` operator is used for integer division in Python. The `range(limit7 + 1)` function generates a sequence of numbers from 0 to `limit7` inclusive. The `if check` statement checks if `check` is `True` and prints "Yes" if it is, otherwise it prints "No".
<|EOT|>
