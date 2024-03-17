<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
def to_binary(n):
    return format(n, '032b')

a, b = map(int, input().split())

print(to_binary(a & b))
print(to_binary(a | b))
print(to_binary(a ^ b))
```

This Python code does the same thing as the Java code. It reads two integers from the input, performs bitwise AND, OR, and XOR operations on them, and then prints the results in binary format. The `to_binary` function is used to convert a number to its binary representation.<｜end▁of▁sentence｜>
