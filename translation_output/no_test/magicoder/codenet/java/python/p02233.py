<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;


public class p02233 {

	static int[] memo=new int[100];
	static int fib(int n) {
		if (memo[n]!=0) return memo[n];
		if (n==0||n==1) return memo[n]=1;
		return (memo[n-1]=fib(n-1))+(memo[n-2]=fib(n-2));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(fib(scan.nextInt()));
	}

}
```

@@ Response
```python
def fib(n, memo={}):
    if n in memo:
        return memo[n]
    if n <= 1:
        return 1
    memo[n] = fib(n-1, memo) + fib(n-2, memo)
    return memo[n]

n = int(input())
print(fib(n))
```

This Python code does the same thing as the Java code. It uses a dictionary (memo) to store previously computed Fibonacci numbers, which significantly speeds up the computation for larger inputs. The input is read from the user using the `input()` function, and the Fibonacci number at that position is printed.<｜end▁of▁sentence｜>
