<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
733035 244345 48869 1


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
                if(i != a) {
                    System.out.print(" ");
                }
                a = i;
            }
        }
        System.out.println();
    }
}
```

This Java code reads an integer from the standard input, then iterates from that number down to 1. If the current number is a divisor of the original number, it prints that number. The numbers are separated by spaces.

Please note that the Python code you provided does not print a newline after the last number, so the Java code does the same.
<|EOT|>
