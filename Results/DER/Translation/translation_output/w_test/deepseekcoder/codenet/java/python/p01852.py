<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


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

n = int(sys.stdin.readline().strip())
print(finger_counting(n))
```

In this Python code, we define a function `finger_counting` that takes a long integer `n` as input and returns the count of fingers needed to count from 1 to `n`. The function uses a while loop to divide `n` by 2 until it is less than 2, incrementing a counter each time. The counter is then returned as the result. The input `n` is read from standard input and the result of `finger_counting(n)` is printed to standard output.
<|EOT|>
