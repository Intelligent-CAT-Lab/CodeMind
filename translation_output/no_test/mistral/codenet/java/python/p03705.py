<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p03705 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			
			if(a>b||(n==1&&a!=b)) {
				System.out.println(0);
				return;
			}
			if(a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((n-2)*(b-a)+1);
			
	    }
				
	}

```
[/INST]
```python
import sys

n, a, b = map(int, sys.stdin.readline().split())

if a > b or (n == 1 and a != b):
    print(0)
    sys.exit()
elif a == b:
    print(1)
    sys.exit()
else:
    print((n - 2) * (b - a) + 1)
```</s>
