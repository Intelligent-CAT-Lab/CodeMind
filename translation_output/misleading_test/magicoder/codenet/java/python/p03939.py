<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 3

Expected output:
-42.57398214452847

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
Here is the equivalent Python code:

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

This Python code reads the input from the standard input (stdin), splits it into three integers, and assigns them to the variables N, d1, and x respectively. It then enters a loop that runs N times. In each iteration, it calculates the sum of d1 and the product of (N-0.5) and x, and updates d1 and x according to the formulas provided in the Java code. Finally, it prints the calculated sum.<｜end▁of▁sentence｜>
