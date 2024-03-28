<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
276

```
import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("æ´æ°ãå¥åãã¦ãã ãã");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i && i <= 179) {
            while (!((i * j) % k == 0)) {
                ++j;
            }
            System.out.println(j);
        } else {
            System.out.println("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§å¥åãã¦ãã ããã");
        }
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    k = 360
    j = 1

    try:
        i = int(input())
    except ValueError:
        print("Invalid input!")
        sys.exit(1)

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("Invalid input! The input should be between 1 and 179.")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, checks if it's within the valid range, and then finds the smallest integer `j` such that `i * j` is divisible by `k`. If the input is not a valid integer or is not within the valid range, it prints an error message and exits.<｜end▁of▁sentence｜>
