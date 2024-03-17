<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(bin(a & b)[2:].zfill(32))
    print(bin(a | b)[2:].zfill(32))
    print(bin(a ^ b)[2:].zfill(32))

if __name__ == "__main__":
    main()
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into two numbers separated by a space.
* `map(int, ...)` converts the two numbers to integers.
* `bin(a & b)` converts the bitwise AND of `a` and `b` to a binary string.
* `bin(a | b)` converts the bitwise OR of `a` and `b` to a binary string.
* `bin(a ^ b)` converts the bitwise XOR of `a` and `b` to a binary string.
* `zfill(32)` pads the binary strings with zeros to make them 32 characters long.
* `bin(...)[2:]` removes the leading `0b` from the binary strings.
* `print()` prints the binary strings to the standard output.

Note: The `bin()` function in Python returns a binary string with a leading `0b`, which is why we need to remove it with `[2:]` and pad the strings with zeros to make them 32 characters long.</s>
