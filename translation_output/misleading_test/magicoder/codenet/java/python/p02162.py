<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9 8 1000 999

Expected output:
Alice

```
import java.util.*;

public class p02162 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		if (r1 == -1 || r2 == -1) {
		    r1 = -t1;
		    r2 = -t2;
		}
		if (r1 == r2) {
		    System.out.println("Draw");
		} else if (r1 < r2) {
		    System.out.println("Bob");
		} else {
		    System.out.println("Alice");
		}
	}
}


```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    t1, t2, r1, r2 = map(int, sys.stdin.readline().split())
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input (sys.stdin), splits it into four integers, and then checks if either r1 or r2 is -1. If so, it negates t1 and t2 and assigns them to r1 and r2 respectively. Then it checks if r1 is equal to r2, if so it prints "Draw", if r1 is less than r2 it prints "Bob", otherwise it prints "Alice".<｜end▁of▁sentence｜>
