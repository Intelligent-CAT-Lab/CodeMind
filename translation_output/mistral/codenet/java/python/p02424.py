<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def to_binary(n):
    binary = ""
    while n != 0:
        binary += str(n % 2)
        n //= 2
    return binary[::-1]

def main():
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    print("A & B:", to_binary(a & b))
    print("A | B:", to_binary(a | b))
    print("A ^ B:", to_binary(a ^ b))

if __name__ == "__main__":
    main()
```</s>
