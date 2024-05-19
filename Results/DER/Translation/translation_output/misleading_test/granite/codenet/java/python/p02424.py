System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
def main():
    a, b = map(int, input().split())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

def to_binary(num):
    binary = ""
    for i in range(32):
        binary = str(num % 2) + binary
        num //= 2
    return binary

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "8 10"
expected_output = "0001000 0001010 0000010"
output = main(test_input)
assert output == expected_output, "Test failed"
```<|endoftext|>
