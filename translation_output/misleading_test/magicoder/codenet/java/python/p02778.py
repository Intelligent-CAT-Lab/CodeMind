<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sardine

Expected output:
xxxx5xxx

```
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }

    }
}
```

@@ Response
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    print('x' * len(s))

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` function to read the input string. Then we use the `*` operator to repeat the string 'x' the number of times equal to the length of the input string. The `strip()` function is used to remove any trailing newline characters.<｜end▁of▁sentence｜>
