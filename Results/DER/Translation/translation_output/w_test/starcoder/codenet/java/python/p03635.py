<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
6


```
import java.util.Scanner;

public class p03635 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println((n-1)*(m-1));
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

n, m = map(int, sys.stdin.readline().split())
print((n-1)*(m-1))
```
<|endoftext|>
