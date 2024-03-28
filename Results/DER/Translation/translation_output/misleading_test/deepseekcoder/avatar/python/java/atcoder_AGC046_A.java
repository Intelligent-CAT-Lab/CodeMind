<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
435

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
Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a counter `i` to 1 and a variable `a` to 0, then enters a loop where it adds `X` to `a` and checks if `a` is divisible by 360. If it is, it prints the value of `i` and breaks the loop. If not, it increments `i` by 1 and continues the loop.
<|EOT|>
