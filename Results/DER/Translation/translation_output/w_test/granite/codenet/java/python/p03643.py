System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
a = int(input())
print("ABC" + str(a))
```

Test input:
```
100
```

Expected output:
```
ABC100
```<|endoftext|>
