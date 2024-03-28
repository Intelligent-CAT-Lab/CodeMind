<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
010
001


```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

### Response:
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

This Java code does the same thing as the Python code. It reads four integers from the input, and then prints a grid of size h by w. The grid is filled with "0"s and "1"s in a certain pattern. The pattern is determined by the values of a and b. If i is less than b, then the i-th row of the grid is filled with a "0"s followed by a "1"s. Otherwise, the i-th row is filled with a "1"s followed by a "0"s.
<|EOT|>
