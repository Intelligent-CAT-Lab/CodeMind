<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 3

Expected output:
4.500000000000000


```
import java.util.*;

public class p03939 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double d1 = sc.nextInt();
		double x = sc.nextInt();
		
		double ans = 0;
		
		for(; N>0; N--) {
			ans += d1 + (N-0.5)*x;
			d1 = ((2*N+2)*d1 + 5*x)/(2*N);
			x = ((double)N+2)/N*x;
		}
		
		System.out.println(ans);
		sc.close();
	}
}

```

@@ Response
```python
import sys

def main():
    N, d1, x = map(int, sys.stdin.readline().split())

    ans = 0

    for _ in range(N):
        ans += d1 + (N-0.5)*x
        d1 = ((2*N+2)*d1 + 5*x)/(2*N)
        x = ((N+2)/N)*x

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of a sequence, and prints the result. The sequence is calculated in a similar way to the Java code.<｜end▁of▁sentence｜>
