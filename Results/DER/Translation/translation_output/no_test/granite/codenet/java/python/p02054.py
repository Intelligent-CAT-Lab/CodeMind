System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2? "Hom" : "Tem");
	}
}


```


Answer:
```python
import sys

odd = 0
for i in range(3):
    odd += int(sys.stdin.readline()) % 2

print("Hom" if odd >= 2 else "Tem")
```<|endoftext|>
