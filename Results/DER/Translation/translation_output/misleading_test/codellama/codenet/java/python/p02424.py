<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(bin(a & b))
    print(bin(a | b))
    print(bin(a ^ b))

if __name__ == "__main__":
    main()
```
Note: The `bin()` function in Python returns the binary representation of a number as a string, so we can use it to convert the result of the bitwise operations to a binary string.

Also, the `map()` function is used to convert the input from a string to an integer, and the `split()` method is used to split the input into two numbers.

The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed only when the script is run as a standalone program, and not when it is imported as a module.</s>
