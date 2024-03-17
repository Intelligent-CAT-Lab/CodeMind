<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
Even


```
import java.util.Scanner;

public class p03455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		if (X%2==0||Y%2==0) {
			System.out.println("Even");
			return ;
		}
		System.out.println("Odd");
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

X, Y = map(int, sys.stdin.readline().split())
if X%2==0 or Y%2==0:
    print("Even")
else:
    print("Odd")
```
<|endoftext|>
