<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
def to_binary(n):
    return bin(n)[2:]

def main():
    a, b = map(int, input().split())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, performs bitwise AND, OR, and XOR operations on them, and then prints the results in binary format. The `to_binary` function is used to convert a number to binary. The `bin` function in Python returns a string that starts with '0b' to indicate that it's a binary number, so we use `[2:]` to remove the first two characters.<｜end▁of▁sentence｜>
