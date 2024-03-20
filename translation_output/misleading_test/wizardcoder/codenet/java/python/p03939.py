Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

def p03939():
    N = int(input())
    d1 = float(input())
    x = float(input())

    ans = 0

    for i in range(N):
        ans += d1 + (i-0.5)*x
        d1 = ((2*i+2)*d1 + 5*x)/(2*i+3)
        x = ((i+2)/i)*x

    print(ans)

p03939()
```

Explanation:

We can use a for loop to iterate through the given values of N, d1, and x. We can initialize the variable ans to 0 and then use the formula for the sum of an arithmetic sequence to calculate the value of ans. We can also use the formula for the nth term of an arithmetic sequence to calculate the value of d1 and x for each iteration of the loop. Finally, we can print the value of ans.<|endoftext|>
