System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2


```
import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}
```


Answer:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print(n - k + 1)

if __name__ == "__main__":
    main()
```

Test input:
```
3 2
```

Expected output:
```
2
```<|endoftext|>
