System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
import java.util.Scanner;

/**
 * A :???????????Â°?????? / Finger Counting
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


Answer:
```python
def finger_counting(n):
    count = 0
    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    return count

# Test the function
print(finger_counting(0))  # Output: 0
```<|endoftext|>
