<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2


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

def find_solution(n):
    for i in range(1, 3510):
        for j in range(1, 3510):
            si = n * i * j
            bo = 4 * i * j - n * j - n * i
            if bo <= 0:
                continue
            if si % bo == 0:
                return i, j, si // bo

n = int(sys.stdin.readline())
i, j, k = find_solution(n)
print(i, j, k)
```

In this Python code, we define a function `find_solution(n)` that takes an integer `n` as input and returns a tuple `(i, j, k)`. The function iterates over `i` and `j` in the range 1 to 3510, calculates `si` and `bo`, and checks if `si` is divisible by `bo`. If it is, the function returns `(i, j, k)`, where `k = si / bo`. The main part of the code reads an integer from the standard input, calls `find_solution(n)`, and prints the result.
<|EOT|>
