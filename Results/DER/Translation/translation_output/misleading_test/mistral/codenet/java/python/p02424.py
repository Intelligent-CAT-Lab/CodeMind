<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 10

Expected output:
981
1038
36

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
[/INST]
```python
a, b = map(int, input().split())
print(bin(a & b)[2:])
print(bin(a | b)[2:])
print(bin(a ^ b)[2:])

def bin(x):
    return bin(x)[2:]
```</s>
