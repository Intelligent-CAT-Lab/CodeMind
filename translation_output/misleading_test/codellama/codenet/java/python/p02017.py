<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
PNo

```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```
[/INST]
```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}
```

This is a Java program that reads in four integers from the user and then prints "Yes" or "No" depending on the values of the integers.

Here is the equivalent Python code:
```
import sys

h, w, x, y = map(int, sys.stdin.readline().split())

if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```
This code uses the `map` function to convert the input from the user into integers, and then uses the `%` operator to check if the product of `h` and `w` is odd and if the sum of `x` and `y` is odd. If both conditions are true, it prints "No", otherwise it prints "Yes".</s>
