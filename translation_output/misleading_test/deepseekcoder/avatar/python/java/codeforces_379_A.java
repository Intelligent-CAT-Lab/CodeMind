<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
80 970

Expected output:
129

```
a , b = map ( int , input ( ) . split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b != 0 :
    h += 1
    s = s - b + 1
print ( h )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes variables `x`, `h`, and `s` to `a`, `0`, and `0` respectively, and then enters two while loops. The first loop decrements `x`, increments `h`, and increments `s` until `x` is less than or equal to `0`. The second loop increments `h` until `s` divided by `b` is not equal to `0`, and then it updates the value of `s`. Finally, it prints the value of `h`.
<|EOT|>
