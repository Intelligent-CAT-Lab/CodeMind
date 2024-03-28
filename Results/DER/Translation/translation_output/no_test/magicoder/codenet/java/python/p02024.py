<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02024 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s = sc.nextInt();
		long t = sc.nextInt();
		if (h * w % 2 == 1 && (s * w + t) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```

@@ Response
```python
import sys

def main():
    h, w, s, t = map(int, sys.stdin.readline().split())
    if h * w % 2 == 1 and (s * w + t) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then checks if the product of `h` and `w` is odd and the sum of `s` and `t` is odd. If either of these conditions is true, it prints "No". Otherwise, it prints "Yes".<｜end▁of▁sentence｜>
