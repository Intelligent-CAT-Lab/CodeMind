<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
10
1
41

```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    System.out.print("0");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("1");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.print("1");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, and then prints a grid of size `h` by `w` where the first `a` columns (or rows, depending on whether you count rows or columns first) are filled with `0`s, and the remaining columns (or rows) are filled with `1`s. The pattern repeats every `b` rows (or columns).
<|EOT|>
