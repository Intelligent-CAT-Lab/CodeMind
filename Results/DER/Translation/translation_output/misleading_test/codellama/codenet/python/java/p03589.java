<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2 2 -7

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
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
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `System.out.println()` method to print the output. The `System.exit(0)` method is used to exit the program after the first solution is found.

Note that the `int` type in Java is used to represent integers, and the `%` operator is used for modulo division. The `System.out.println()` method is used to print the output, and the `System.exit(0)` method is used to exit the program.</s>
