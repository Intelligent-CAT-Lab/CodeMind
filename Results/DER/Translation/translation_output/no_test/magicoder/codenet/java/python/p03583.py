<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}

```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                return

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from standard input, then iterates over all pairs of integers `(i, j)` in the range `1 <= i, j <= 3510`. For each pair, it calculates `si` and `bo` as in the Java code, and checks if `si` is divisible by `bo`. If it is, it prints the pair and the quotient of `si` divided by `bo`, and then returns. If no such pair is found after checking all pairs, the function does nothing.<｜end▁of▁sentence｜>
