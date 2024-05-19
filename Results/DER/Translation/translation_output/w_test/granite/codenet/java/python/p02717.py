System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3 1 2


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

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    print(c, a, b)

if __name__ == "__main__":
    main()
```

Test input:
```
1 2 3
```

Expected output:
```
3 1 2
```<|endoftext|>
