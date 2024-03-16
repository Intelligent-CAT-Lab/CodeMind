<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads four integers from the input, and then prints a pattern of 0s and 1s to the console. The pattern alternates between having `a` 0s followed by `w-a` 1s and `a` 1s followed by `w-a` 0s for `h` lines.
<|EOT|>
