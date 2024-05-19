System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 10

Expected output:
00000000000000000000000000001000
00000000000000000000000000001010
00000000000000000000000000000010


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
def toString(x):
    sb = ""
    for i in range(32):
        sb = str(x % 2) + sb
        x //= 2
    return sb

def main():
    a, b = map(int, input().split())
    print(toString(a & b))
    print(toString(a | b))
    print(toString(a ^ b))

if __name__ == "__main__":
    main()
```


Test input:
```
8 10
```

Expected output:
```
00000000000000000000000000000100
00000000000000000000000000001010
00000000000000000000000000000010
```<|endoftext|>
