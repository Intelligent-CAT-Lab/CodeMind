<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def fib(n, memo={}):
    if n in memo: return memo[n]
    if n==0 or n==1: return 1
    memo[n] = fib(n-1, memo) + fib(n-2, memo)
    return memo[n]

n = int(input())
print(fib(n))
```
<|EOT|>
