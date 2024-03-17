<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
360


```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i += 1;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then adds it to a running total (`a`) in a loop. It increments a counter (`i`) each time it adds `X` to `a`. The loop continues until `a` is a multiple of 360. When this happens, it prints the value of `i` and breaks the loop.
<|EOT|>
