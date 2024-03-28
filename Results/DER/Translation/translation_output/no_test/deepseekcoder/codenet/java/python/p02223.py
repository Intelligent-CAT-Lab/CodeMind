<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    N = int(sys.stdin.readline().strip())
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
            s = '1' * i
            print(s[0] + '0' + s[1:])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, and then prints out a certain number of strings based on the value of the integer. If the integer is 1, it prints out "0". If the integer is 2, it prints out "0" and "11". For any other integer, it prints out "N - 1" followed by "N" strings where the first and last characters are "0" and the rest are "1".
<|EOT|>
