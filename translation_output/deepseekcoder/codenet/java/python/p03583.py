<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    n = int(input())
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                print(i, j, si // bo)
                sys.exit()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then iterates over a range of numbers from 1 to 3510 for both `i` and `j`. For each pair of `i` and `j`, it calculates `si` and `bo` as in the Java code, and checks if `bo` is non-positive or if `si` is not divisible by `bo`. If either condition is true, it continues to the next pair of `i` and `j`. If neither condition is true, it prints the pair of `i` and `j` along with `si / bo` and exits the program.
<|EOT|>
