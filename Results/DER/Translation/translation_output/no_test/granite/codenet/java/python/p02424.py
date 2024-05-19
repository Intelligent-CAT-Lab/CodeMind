System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02424 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(toString(a & b));
		System.out.println(toString(a | b));
		System.out.println(toString(a ^ b));
	}
	
	static String toString(long x) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 32; i++) {
		    sb.append(x % 2);
		    x /= 2;
		}
	    return sb.reverse().toString();
	}
}


```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

def to_binary(x):
    return ''.join(str(x & 1) for _ in range(32))[::-1]

if __name__ == '__main__':
    main()
```<|endoftext|>
