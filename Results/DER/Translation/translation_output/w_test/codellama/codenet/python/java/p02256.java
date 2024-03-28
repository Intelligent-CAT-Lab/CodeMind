<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)

```
[/INST]
```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y != 0) {
            x = y;
            y = x % y;
        }
        System.out.println(y);
    }
}
```
This code uses the same algorithm as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `int` data type to store the values of `x` and `y`. The `if` statement is used to swap the values of `x` and `y` if `x` is greater than `y`. The `while` loop is used to calculate the greatest common divisor of `x` and `y`. The `System.out.println` method is used to print the result.</s>
