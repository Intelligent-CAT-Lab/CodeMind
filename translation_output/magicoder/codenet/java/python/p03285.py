<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03285 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
```

@@ Response
```python
import sys

def main():
    N = int(sys.stdin.readline())
    limit7 = N // 7
    check = False
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            check = True
    if check:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the limit7, and then checks if there is a combination of 7's and 4's that add up to the input number. If there is, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
