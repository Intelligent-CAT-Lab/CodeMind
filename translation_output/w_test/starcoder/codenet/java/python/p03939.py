<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
	N = int(sys.stdin.readline())
	d1 = int(sys.stdin.readline())
	x = int(sys.stdin.readline())
	
	ans = 0
	
	for i in range(N):
		ans += d1 + (i-0.5)*x
		d1 = ((2*i+2)*d1 + 5*x)/(2*i)
		x = ((i+2)/i)*x
	
	print(ans)

if __name__ == "__main__":
	main()

```
<|endoftext|>
