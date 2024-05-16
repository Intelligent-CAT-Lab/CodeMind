System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}

```


Answer:
```python
import sys

a, b, c = sys.stdin.read().split()
print(c, a, b)
```<|endoftext|>
