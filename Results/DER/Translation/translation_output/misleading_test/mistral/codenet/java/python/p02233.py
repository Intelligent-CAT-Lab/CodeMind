<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
101

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
```python
def fib(n):
    memo = [0] * 100
    if memo[n] != 0:
        return memo[n]
    elif n == 0 or n == 1:
        memo[n] = 1
    else:
        memo[n] = fib(n-1) + fib(n-2)
    return memo[n]

n = int(input())
print(fib(n))
```</s>
