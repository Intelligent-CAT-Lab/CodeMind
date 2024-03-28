<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
59 96

Expected output:
155 245

```
n , m = map ( int , input ( ) . split ( ) )
if n < 1 :
    if m < 1 :
        print ( n , m )
        quit ( )
    print ( " Impossible " )
    quit ( )
if m > n :
    min = m
    max = n + m - 1
    print ( min , max )
if m <= n :
    min = n
    max = n + m - 1
    if m == 0 :
        max = n
    print ( min , max )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n < 1) {
            if (m < 1) {
                System.out.println(n + " " + m);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }

        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        }

        if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, and then checks if the first integer is less than 1. If it is, it checks if the second integer is also less than 1. If both are true, it prints the two integers and exits. If not, it prints "Impossible" and exits.

If the first integer is not less than 1, it checks if the second integer is greater than the first. If it is, it calculates the minimum and maximum values based on the conditions given in the Python code and prints them. If the second integer is less than or equal to the first, it does the same as above, but also checks if the second integer is 0. If it is, it sets the maximum value to the first integer.
<|EOT|>
