<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100000 3125 2

Expected output:
-91

```
T , s , q = map ( int , input ( ) . split ( ) )
v = ( q - 1 ) / q
tm = 1
t = s / ( 1 - v )
while ( T - s ) / v - t > 0 :
    if ( T - s ) / v - t < 1e-10 :
        break
    tm += 1
    s += v * t
    t = s / ( 1 - v )
print ( tm )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);

        double v = (q - 1) / (double) q;
        int tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if (Math.abs((T - s) / v - t) < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
```

This Java code reads the input from the console, splits it into three integers, and then performs the same operations as the Python code. It calculates the value of `v`, `t`, and `tm` in a similar way as the Python code, and then prints the value of `tm`.<｜end▁of▁sentence｜>
