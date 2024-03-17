<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100000 3125 2

Expected output:
5


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
        int T, s, q;
        T = scanner.nextInt();
        while (T-- > 0) {
            s = scanner.nextInt();
            q = scanner.nextInt();
            double v = (q - 1) / q;
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
}
```</s>
