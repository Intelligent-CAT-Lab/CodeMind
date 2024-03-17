<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
3


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
[/INST]
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

In this code, the `fib` function is defined to calculate the nth Fibonacci number using memoization. The `memo` array is used to store the results of previous calculations, so that they don't have to be recalculated every time the function is called.

The `fib` function takes an integer `n` as input, and returns the nth Fibonacci number. If the result is already stored in the `memo` array, it is returned directly. Otherwise, the function calculates the result by calling itself recursively with `n-1` and `n-2` as inputs, and storing the result in the `memo` array.

The `main` function takes an integer `n` as input from the user, and prints the nth Fibonacci number using the `fib` function.

Here is the equivalent Python code:
```
import sys

memo = [0] * 100

def fib(n):
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        return memo[n] = 1
    return (memo[n-1] = fib(n-1)) + (memo[n-2] = fib(n-2))

n = int(sys.stdin.readline())
print(fib(n))
```
This code uses a list `memo` to store the results of previous calculations, and a function `fib` to calculate the nth Fibonacci number. The `fib` function takes an integer `n` as input, and returns the nth Fibonacci number. If the result is already stored in the `memo` list, it is returned directly. Otherwise, the function calculates the result by calling itself recursively with `n-1` and `n-2` as inputs, and storing the result in the `memo` list.

The `main` function takes an integer `n` as input from the user, and prints the nth Fibonacci number using the `fib` function.</s>
