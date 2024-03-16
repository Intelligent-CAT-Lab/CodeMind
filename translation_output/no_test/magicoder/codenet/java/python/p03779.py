<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```

@@ Response
```python
import sys

def main():
    x = int(sys.stdin.readline())
    ans = 0

    for i in range(100000):
        if x <= i * (i + 1) // 2:
            ans = i
            break

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over a range of numbers from 0 to 99999 (inclusive). If the input number is less than or equal to the sum of the first `i` natural numbers (i.e., `i * (i + 1) / 2`), it sets `ans` to `i` and breaks the loop. Finally, it prints the value of `ans`.<｜end▁of▁sentence｜>
