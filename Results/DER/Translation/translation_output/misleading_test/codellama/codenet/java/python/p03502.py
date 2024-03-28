<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
Yoes

```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```
[/INST]
```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int X = N;

		int fx = 0;


		while(N>=10) {

			fx += N%10;

			N /= 10;

		}

		fx += N;

		if(X%fx == 0) System.out.println("Yes");

		else System.out.println("No");
	}

}
```

This is the Java code provided. To translate it to Python, we can use the same logic and syntax. Here's the Python code:
```
import sys

N = int(sys.stdin.readline())

X = N

fx = 0

while N >= 10:
    fx += N % 10
    N //= 10

fx += N

if X % fx == 0:
    print("Yes")
else:
    print("No")
```
This code reads an integer `N` from standard input using `sys.stdin.readline()`, and then calculates the sum of the digits of `N` using a while loop. The result is stored in `fx`. Finally, the code checks if `X` is divisible by `fx`, and prints "Yes" or "No" accordingly.</s>
