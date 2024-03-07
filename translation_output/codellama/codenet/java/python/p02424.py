<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

print(bin(a & b)[2:])
print(bin(a | b)[2:])
print(bin(a ^ b)[2:])
```
Explanation:

* `map(int, sys.stdin.readline().split())` reads the input from stdin and splits it into two integers.
* `a & b` performs the bitwise AND operation on the two integers.
* `a | b` performs the bitwise OR operation on the two integers.
* `a ^ b` performs the bitwise XOR operation on the two integers.
* `bin(a & b)[2:]` converts the result of the bitwise AND operation to a binary string and returns it without the leading `0b` prefix.
* `bin(a | b)[2:]` converts the result of the bitwise OR operation to a binary string and returns it without the leading `0b` prefix.
* `bin(a ^ b)[2:]` converts the result of the bitwise XOR operation to a binary string and returns it without the leading `0b` prefix.

Note: The `bin()` function is used to convert the integer to a binary string, and the `[2:]` slice is used to remove the leading `0b` prefix.</s>
