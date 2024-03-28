<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YES


```
import java.util.Scanner;

public class p03730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 0; i < 5000; i++) {
			if (a * i % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```

python code:<fim_suffix><fim_middle>

```python
import sys

a,b,c = map(int,sys.stdin.readline().split())

for i in range(5000):
    if a*i%b == c:
        print("YES")
        break
else:
    print("NO")
```
<|endoftext|>
