<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
1948

```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```
[/INST]
```python
# Python implementation of p00352

# Read input
n, m = map(int, input().split())

# Calculate output
print((n + m) // 2)
```</s>
