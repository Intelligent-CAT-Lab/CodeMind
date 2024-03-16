<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02398 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int z = sc.nextInt();
	    int t = 0;
	    for (int i = x; i <= y; i++) {
	    	if (z % i == 0)
	    		t++;
	    } System.out.println(t);
     }
}


```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())
    z = int(sys.stdin.readline())
    t = 0
    for i in range(x, y + 1):
        if z % i == 0:
            t += 1
    print(t)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, then counts how many of the numbers in the range from `x` to `y` (inclusive) divide `z` evenly. The result is then printed to the standard output.<｜end▁of▁sentence｜>
