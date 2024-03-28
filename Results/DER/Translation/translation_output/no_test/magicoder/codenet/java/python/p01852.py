<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
# A : Finger Counting

def main():
    n = int(input())
    count = 0

    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of times it can be divided by 2 (which is equivalent to counting the number of times it can be represented as a power of 2), and then prints the result.<｜end▁of▁sentence｜>
