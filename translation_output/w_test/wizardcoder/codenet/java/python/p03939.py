Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

We can use a for loop to iterate through the given input N times. In each iteration, we calculate the sum of the current value of d1 and the sum of the first i terms of the series. We also update the values of d1 and x for the next iteration. Finally, we print the sum of the series.

In the first iteration, we add d1 to the sum and then calculate the next value of d1 and x. In the second iteration, we add d1+x to the sum and then calculate the next value of d1 and x. We continue this process until we have iterated through N times.

We can use the math module to calculate the square root of a number. We can use the math.sqrt() function to calculate the square root of a number. For example, math.sqrt(4) will return 2.0.<|endoftext|>
