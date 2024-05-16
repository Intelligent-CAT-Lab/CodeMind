System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    print((a + b) // 2)

if __name__ == "__main__":
    main()
```<|endoftext|>
