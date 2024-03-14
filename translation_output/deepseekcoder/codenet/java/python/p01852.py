<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * A : ???????????Â°?????? / Finger Counting
 */
public class p01852 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		long n = sc.nextLong();
		int count = 0;

		if (n > 0) {
			while (n >= 2) {
				n /= 2;
				count++;
			}
			count++;
		}
		System.out.println(count);
	}
}
```

### Response:
```python
import sys

def finger_counting(n):
    count = 0
    if n > 0:
        while n >= 2:
            n /= 2
            count += 1
        count += 1
    return count

n = int(sys.stdin.readline())
print(finger_counting(n))
```

This Python code does the same thing as the Java code. It reads a long integer from the standard input, counts the number of times it can be divided by 2 (which is the same as counting the number of binary digits), and then prints the result.
<|EOT|>
