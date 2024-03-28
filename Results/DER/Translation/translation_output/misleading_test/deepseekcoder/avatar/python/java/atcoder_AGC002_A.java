<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positie

```
a , b = map ( int , input ( ) . split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )


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

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && Math.min(b - a, -a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
```

This Java code reads two integers from the standard input, and then checks if the first integer is less than or equal to zero and the second integer is greater than or equal to zero. If this is the case, it prints "Zero". If the first integer is less than zero and the absolute difference between the two integers and the first integer is even, it prints "Negative". Otherwise, it prints "Positive".
<|EOT|>
