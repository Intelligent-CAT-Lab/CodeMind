<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
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
    h, w, x, y = map(int, sys.stdin.readline().split())
    if h * w % 2 == 1 and (x + y) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then checks if the product of the height and width is odd and the sum of the x and y coordinates is odd. If either condition is true, it prints "No". Otherwise, it prints "Yes".<｜end▁of▁sentence｜>
