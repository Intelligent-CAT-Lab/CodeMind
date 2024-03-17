<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
1


```
import java.util.Scanner;

public class p03345 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}

```

@@ Response
```python
import sys

def main():
    a, b, c, k = map(int, sys.stdin.readline().split())
    ans = a - b
    if abs(ans) > 10**18:
        print("Unfair")
        return
    if k % 2 == 0:
        print(ans)
    else:
        print(ans * -1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the difference between the first two, checks if the absolute value of the difference is greater than 10^18, and then prints the difference or its negation depending on the parity of the third integer.<｜end▁of▁sentence｜>
