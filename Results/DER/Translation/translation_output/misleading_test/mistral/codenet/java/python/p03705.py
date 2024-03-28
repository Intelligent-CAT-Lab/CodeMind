<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4 6

Expected output:
-17

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
n, a, b = map(int, input().split())

if a > b or (n == 1 and a != b):
    print(0)
    exit()

if a == b:
    print(1)
    exit()

print((n - 2) * (b - a) + 1)
```</s>
