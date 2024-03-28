<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03861 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long x=sc.nextLong();
		long count=0;
		count=b/x-a/x;
		if(a%x==0)count++;
		System.out.println(count);
	}
}
	
```

@@ Response
```python
import sys

def main():
    a, b, x = map(int, sys.stdin.readline().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three long integers from the standard input, calculates the count, and prints it. The `//` operator in Python is used for integer division, which is equivalent to `/` in Java but rounds down to the nearest integer.<｜end▁of▁sentence｜>
