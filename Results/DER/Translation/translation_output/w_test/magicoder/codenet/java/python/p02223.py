<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
2
0
11


```
import java.util.Arrays;
import java.util.Scanner;

public class p02223 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
			System.out.println("0");
		} else if (N == 2) {
			System.out.println(2);
			System.out.println("0");
			System.out.println("11");
		} else {
			System.out.println(N - 1);
			for (int i = 2; i <= N; i++) {
				char[] s = new char[i];
				Arrays.fill(s, '1');
				s[0] = s[i - 1] = '0';
				System.out.println(String.valueOf(s));
			}
		}
	}

}

```

@@ Response
```python
import sys

def main():
    N = int(sys.stdin.readline())
    if N == 1:
        print(1)
        print("0")
    elif N == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = ['1'] * i
            s[0] = s[-1] = '0'
            print(''.join(s))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints the appropriate output based on the value of N. If N is 1 or 2, it prints the expected output. If N is greater than 2, it prints N - 1 and then prints a string of '0's and '1's of length i, where i ranges from 2 to N, with the first and last characters of the string being '0's.<｜end▁of▁sentence｜>
