System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

N = int(input())
d1 = int(input())
x = int(input())

ans = 0

for _ in range(N):
    ans += d1 + (N-0.5)*x
    d1 = ((2*N+2)*d1 + 5*x)/(2*N)
    x = ((N+2)/N)*x

print(ans)
```<|endoftext|>
