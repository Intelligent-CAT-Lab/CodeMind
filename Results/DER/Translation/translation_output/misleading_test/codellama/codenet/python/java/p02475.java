<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
16

```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```
[/INST]
```java
import java.util.Scanner;

public class Round {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a * b < 0) {
			System.out.println(-(-a / b));
		} else {
			System.out.println(a / b);
		}
	}
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses the `if` statement to check if the product of `a` and `b` is negative or not. If it is negative, it returns the negative of the result of the division of `-a` by `b`, otherwise it returns the result of the division of `a` by `b`. Finally, it prints the result to the console.</s>
