<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
N=int(input())
for h in range(1,3501):
    for n in range(h,3501):
        if 4*n*h-N*h-N*n >0:
            if (N*h*n)%(4*n*h-N*h-N*n)==0:
                w=int((N*h*n)/(4*n*h-N*h-N*n))
                print(h,n,w)
                sys.exit()
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int h = 1; h <= 3500; h++) {
            for (int n = h; n <= 3500; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (N * h * n) / (4 * n * h - N * h - N * n);
                        System.out.println(h + " " + n + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the standard input, then iterates over all possible values of `h` and `n` in the range 1 to 3500. For each pair of `h` and `n`, it checks if the condition `4*n*h-N*h-N*n > 0` is true. If it is, it then checks if `(N*h*n)%(4*n*h-N*h-N*n)` equals 0. If both conditions are true, it calculates `w` as `(N*h*n)/(4*n*h-N*h-N*n)` and prints `h`, `n`, and `w`. The program then exits.
<|EOT|>
