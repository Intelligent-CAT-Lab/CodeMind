<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

memo = [0] * 100

def fib(n):
    if memo[n] != 0:
        return memo[n]
    if n == 0 or n == 1:
        return memo[n] = 1
    return memo[n-1] = fib(n-1) + memo[n-2] = fib(n-2)

if __name__ == "__main__":
    n = int(sys.stdin.readline())
    print(fib(n))
```
This is the Python translation of the Java code. The `memo` array is initialized with 0s, and the `fib` function is defined with the same logic as the Java code. The `if __name__ == "__main__":` block is used to run the `fib` function with the input from the user.</s>
