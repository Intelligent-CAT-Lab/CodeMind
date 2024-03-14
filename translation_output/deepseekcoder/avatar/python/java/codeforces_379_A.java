<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads two integers from the input, assigns the first one to `a` and the second one to `b`. Then it initializes `x`, `h`, and `s` to `a`, `0`, and `0` respectively. The first while loop decrements `x`, `h`, and `s` by 1 in each iteration until `x` is not greater than `0`. The second while loop increments `h` by 1 and sets `s` to `s - b + 1` in each iteration until `s` divided by `b` is not equal to `0`. Finally, it prints the value of `h`.
<|EOT|>
