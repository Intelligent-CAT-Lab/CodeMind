<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    result = []

    for i in range(h):
        row = []
        for j in range(w):
            x = 1 if (j < a) ^ (i < b) else 0
            row.append(str(x))
        result.append("".join(row))
    print("\n".join(result))

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads four integers from the input, and then generates a binary matrix of size h by w. The matrix is filled with 1s in the positions where the column index is less than a and the row index is less than b, or vice versa. The matrix is then printed to the standard output.
<|EOT|>
