<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100


```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```
[/INST]
```python
a = int(input())
print("ABC" + str(a))
```</s>
