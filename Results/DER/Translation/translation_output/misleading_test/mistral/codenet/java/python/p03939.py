<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

N = int(input())
d1 = float(input())
x = int(input())

ans = 0

for N > 0:
    ans += d1 + (N - 0.5) * x
    d1 = ((2 * N + 2) * d1 + 5 * x) / (2 * N)
    x = ((N + 2) / N) * x

print(ans)
```</s>
