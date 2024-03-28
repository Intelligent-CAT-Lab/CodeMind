<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Yes


```

import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

```
[/INST]
```
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    if (A == B and B == C) or (A != B and A != C and B != C):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `if` statement is used to check if the input is valid, and the `print` function is used to print the output.</s>
