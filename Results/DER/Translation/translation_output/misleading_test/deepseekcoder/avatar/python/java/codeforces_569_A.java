<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        double v = (double)(q - 1) / q;
        int tm = 1;
        double t = (double)s / (1 - v);
        while (Math.abs((T - s) / v - t) > 1e-10) {
            tm++;
            s += (int)(v * t);
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the value of `v`, and then enters a loop where it increments `tm`, updates `s`, and recalculates `t` until the difference between `(T - s) / v` and `t` is less than 1e-10. It then prints the value of `tm`.
<|EOT|>
