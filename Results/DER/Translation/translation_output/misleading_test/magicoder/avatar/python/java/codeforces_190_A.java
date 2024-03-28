<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

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

This Java code reads two integers from the standard input, and then performs the same operations as the Python code. It checks if `n` is less than 1, and if so, it checks if `m` is also less than 1. If so, it prints `n` and `m` and exits. If `m` is not less than 1, it prints "Impossible" and exits. If `n` is not less than 1, it checks if `m` is greater than `n`. If so, it calculates the minimum and maximum values and prints them. If `m` is less than or equal to `n`, it calculates the minimum and maximum values and checks if `m` is 0. If so, it sets the maximum value to `n`. It then prints the minimum and maximum values.<｜end▁of▁sentence｜>
