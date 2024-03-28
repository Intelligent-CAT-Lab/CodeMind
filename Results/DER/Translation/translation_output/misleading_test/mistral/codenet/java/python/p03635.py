<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
96

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
[/INST]
```python
n, m = map(int, input().split())
print((n-1)*(m-1))
```</s>
