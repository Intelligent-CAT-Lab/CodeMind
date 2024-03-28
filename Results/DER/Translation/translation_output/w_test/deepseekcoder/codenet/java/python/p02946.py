<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 7

Expected output:
5 6 7 8 9


```
import java.util.Scanner;

public class p02946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();

		for (int i = X - K + 1; i <= X + K - 1; i++) {
			if (i != X + K - 1) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
			}
		}
	}
}

```

### Response:
```python
K, X = map(int, input().split())

for i in range(X - K + 1, X + K):
    if i != X + K - 1:
        print(i, end=" ")
    else:
        print(i)
```

This Python code does the same thing as the Java code. It reads two integers from the input, K and X, and then prints all integers between X - K + 1 and X + K (exclusive) separated by spaces. The print function in Python has an optional argument 'end', which specifies a string to be printed at the end of the line, instead of a newline. By setting end=" " we ensure that the numbers are printed on the same line, separated by spaces.
<|EOT|>
