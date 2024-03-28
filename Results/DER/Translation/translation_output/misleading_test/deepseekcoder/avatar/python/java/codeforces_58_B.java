<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
732989 244387 48927 23

```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i);
                if(i != 1) {
                    System.out.print(" ");
                }
                a = i;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then iterates from that number down to 1. If the current number is a divisor of the original number, it prints that number. The numbers are separated by spaces.
<|EOT|>
