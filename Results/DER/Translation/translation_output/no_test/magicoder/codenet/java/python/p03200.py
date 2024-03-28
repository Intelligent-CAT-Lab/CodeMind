<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

@@ Response
```python
import sys

def main():
    count = 0
    s = sys.stdin.readline().strip()

    i = 0
    black = 0
    for c in s:
        if c == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of 'W's and the number of 'B's, and then calculates the sum of the number of 'W's before each 'B'. The result is printed to the standard output.<｜end▁of▁sentence｜>
