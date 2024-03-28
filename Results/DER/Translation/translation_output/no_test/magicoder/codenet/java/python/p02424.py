<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
def main():
    a = int(input())
    b = int(input())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

def to_string(x):
    return bin(x)[2:].zfill(32)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, performs bitwise AND, OR, and XOR operations on them, and then prints the results in binary format. The `to_string` function is used to convert a number to a binary string. The `[2:]` slice is used to remove the '0b' prefix that Python adds to binary numbers, and the `zfill(32)` method is used to pad the string with zeros to a length of 32.<｜end▁of▁sentence｜>
