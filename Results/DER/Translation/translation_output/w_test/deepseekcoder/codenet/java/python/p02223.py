<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def print_binary_strings(n):
    if n == 1:
        print(1)
        print("0")
    elif n == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(n - 1)
        for i in range(2, n + 1):
            s = '1' * i
            print(s[0] + '0' + s[1:i-1] + '0' + s[i-1])

def main():
    N = int(sys.stdin.readline().strip())
    print_binary_strings(N)

if __name__ == "__main__":
    main()
```

In this Python code, we first define a function `print_binary_strings(n)` that takes an integer `n` as input and prints the desired output. If `n` is 1 or 2, we print the corresponding output directly. If `n` is greater than 2, we print `n - 1` and then generate and print `n` binary strings.

In the `main()` function, we read the input `N` from the standard input, convert it to an integer, and call `print_binary_strings(N)`.

Finally, we call `main()` if the script is run as the main program.
<|EOT|>
