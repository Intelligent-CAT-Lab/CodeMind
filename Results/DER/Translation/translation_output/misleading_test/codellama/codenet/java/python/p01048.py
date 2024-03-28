<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
46

```
import java.util.Scanner;

public class p01048 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[] ans = {0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60};
		int i = sc.nextInt();

		System.out.println(ans[i]);
	}

}

```
[/INST]
```
import sys

ans = [0, 1, 2, 4, 6, 16, 12, 64, 24, 36, 48, 1024, 60]

i = int(sys.stdin.readline())

print(ans[i])
```
This code reads an integer from standard input using the `sys.stdin.readline()` method, and then uses the `int()` function to convert the input to an integer. It then uses the `ans` list to look up the corresponding value and print it to the console.</s>
