System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
import java.util.Scanner;
public class p02657 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(A*B);

	}
}

```


Answer:
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    print(A * B)

if __name__ == "__main__":
    main()
```

Test input:
```
2 5
```

Expected output:
```
10
```<|endoftext|>
