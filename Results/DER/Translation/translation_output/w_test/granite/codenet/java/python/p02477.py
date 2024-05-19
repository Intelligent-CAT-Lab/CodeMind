System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


```
import java.util.*;
import java.math.*;

class p02477{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		BigInteger A = new BigInteger(str);
		str = sc.next();
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}


```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    print(a * b)

if __name__ == "__main__":
    main()
```

Test input:
```
5 8
```

Expected output:
```
40
```<|endoftext|>
