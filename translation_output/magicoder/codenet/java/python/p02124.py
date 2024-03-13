<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02124{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "ai1333";
		int x = sc.nextInt();
		for(int i=0;i<x/100;i++) {
			ans += "3";
		}
		System.out.println(ans);
	}
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    ans = "ai1333"
    x = int(sys.stdin.readline())
    for i in range(x//100):
        ans += "3"
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, divides it by 100, and adds the same number of "3"s to the string "ai1333". The result is then printed to the standard output.<｜end▁of▁sentence｜>
