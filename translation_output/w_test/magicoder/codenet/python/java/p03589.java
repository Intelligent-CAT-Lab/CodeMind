<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2


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

@@ Response
Here is the Java version of the given Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates over all possible values of `h` and `n`, and checks if the condition `4*n*h-N*h-N*n > 0` is satisfied. If it is, it checks if `(N*h*n)%(4*n*h-N*h-N*n)` equals zero. If it does, it calculates `w` and prints `h`, `n`, and `w`. The `System.exit(0)` statement is used to stop the execution of the program after finding the first solution.<｜end▁of▁sentence｜>
