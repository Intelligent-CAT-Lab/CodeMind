<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
-16

```
import java.util.Scanner;

public class p03345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}

```
[/INST]
```python
import sys

a = int(input())
b = int(input())
c = int(input())
k = int(input())
ans = a - b
if abs(ans) > 10**18:
    print("Unfair")
    sys.exit()
if k % 2 == 0:
    print(ans)
else:
    print(ans * -1)
```</s>
