<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int T = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int q = Integer.parseInt(input[2]);
        double v = (double) (q - 1) / q;
        int tm = 1;
        double t = (double) s / (1 - v);
        while ((T - s) / v - t > 0) {
            if (Math.abs((T - s) / v - t) < 1e-10) {
                break;
            }
            tm += 1;
            s += (int) (v * t);
            t = (double) s / (1 - v);
        }
        System.out.println(tm);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, calculates `v`, `t`, and `tm`, and then enters a loop where it updates `s`, `t`, and `tm` until `(T - s) / v - t` is less than or equal to 1e-10. It then prints `tm`.
<|EOT|>
