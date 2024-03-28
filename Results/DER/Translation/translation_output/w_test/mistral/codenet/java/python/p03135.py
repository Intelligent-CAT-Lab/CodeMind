<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 3

Expected output:
2.6666666667


```
import java.util.Scanner;

public class p03135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		double a;
		a = (double) T / X;
		System.out.println(a);
	}
}

```
[/INST]
```python
T = int(input())
X = int(input())
a = T / X
print(a)
```</s>
