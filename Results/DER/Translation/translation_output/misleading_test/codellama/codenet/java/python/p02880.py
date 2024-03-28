<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
b^Y

```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}

```
[/INST]
```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f ? "Yes" : "No";
		System.out.println(ret);
	}
}
```

This is the Java code for the problem. To translate it to Python, we can use the same logic and syntax. Here's the Python code:
```
import sys

N = int(sys.stdin.readline())
f = False
for A in range(1, 10):
    if N % A == 0 and N / A < 10:
        f = True
        break

if f:
    print("Yes")
else:
    print("No")
```
This code first reads the input from the user using `sys.stdin.readline()` and converts it to an integer using `int()`. It then sets a boolean variable `f` to `False` and loops through the numbers from 1 to 9 using a `for` loop. For each number `A`, it checks if `N` is divisible by `A` and if `N / A` is less than 10. If both conditions are true, it sets `f` to `True` and breaks out of the loop.

After the loop, it checks the value of `f` and prints "Yes" or "No" accordingly.</s>
