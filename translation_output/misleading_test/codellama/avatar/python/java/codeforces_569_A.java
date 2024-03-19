<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        double v = (q - 1) / (double) q;
        double tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
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
This code uses the `Scanner` class to read input from the user, and then it uses the `map` function to convert the input strings to integers. It then calculates the values of `v`, `tm`, and `t` using the given formulae. Finally, it uses a `while` loop to iterate over the number of times the process needs to be repeated, and it prints the final value of `tm` to the console.

Note that the `1e-10` in the code is a small positive number that is used as a threshold to determine when the process should stop. It is a common practice in numerical computations to use a small positive number as a threshold to avoid rounding errors.</s>
