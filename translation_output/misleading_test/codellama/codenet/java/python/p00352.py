<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
1948

```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```
[/INST]
```
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print((a + b) // 2)

if __name__ == "__main__":
    main()
```
This code reads two integers from standard input using the `sys.stdin.readline()` method, splits them using the `split()` method, and then converts them to integers using the `map()` function. It then calculates the average of the two integers and prints it to the console using the `print()` function.

The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed when the script is run directly, rather than when it is imported as a module.</s>
