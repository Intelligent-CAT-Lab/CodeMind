<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
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

This Java code reads the input from the console, splits it into two integers, and then performs the same operations as the Python code. It uses a `Scanner` to read the input, and `Integer.parseInt()` to convert the strings to integers. The `split()` method is used to split the input string into two parts. The `while` loops are used to perform the same operations as the Python code. The `/` operator is used for integer division in Java, and `System.out.println()` is used to print the result.<｜end▁of▁sentence｜>
