<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
vin

```
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}

```
[/INST]
```
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a + b + c >= 22:
    print("bust")
else:
    print("win")
```
Note: The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into a list of strings, which are then converted to integers using the `map` function.</s>
