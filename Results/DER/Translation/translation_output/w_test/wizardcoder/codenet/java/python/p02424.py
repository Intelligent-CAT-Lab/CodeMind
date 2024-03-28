Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
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

The given java code is a solution to the problem of printing the binary representation of a number. The code takes two long inputs from the user, a and b, and performs bitwise AND, OR, and XOR operations on them. The result is then printed as a binary string.

In python, we can achieve the same functionality using the bitwise operators `&`, `|`, and `^`. Here's the solution:

```python
import java.util.*;

def toString(x):
    sb = ""
    for i in range(32):
        sb += str(x & 1)
        x >>= 1
    return sb[::-1]

a = int(input())
b = int(input())

print(toString(a & b))
print(toString(a | b))
print(toString(a ^ b))
```

In the above solution, we define a function `toString` that takes a long input `x` and returns its binary representation as a string. We use a loop to iterate over the 32 bits of the number and append the least significant bit to the string using the bitwise AND operator `&`. We then shift the number to the right by one bit using the right shift operator `>>=`. Finally, we reverse the string using slicing and return it.

We then take two integer inputs from the user and call the `toString` function on each of them to get their binary representation as strings. We print these strings as output.<|endoftext|>
