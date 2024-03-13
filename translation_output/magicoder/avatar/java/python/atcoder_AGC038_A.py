<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int x;
                if (j < a ^ i < b) {
                    x = 1;
                } else {
                    x = 0;
                }
                sb.append(x);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
```

@@ Response
```python
import sys

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    sb = []

    for i in range(h):
        for j in range(w):
            x = 1 if (j < a) ^ (i < b) else 0
            sb.append(str(x))
        sb.append("\n")
    print("".join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then generates a grid of 0s and 1s according to the conditions specified in the Java code. The grid is then printed to the standard output.<｜end▁of▁sentence｜>
