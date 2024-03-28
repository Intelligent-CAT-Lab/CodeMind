Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100000 3125 2

Expected output:
5


```
T, s, q = map ( int, input ( ). split ( ) )
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        double v = (double)(q - 1) / q;
        int tm = 1;
        double t = (double)s / (1 - v);
        while (T - s > 0 && (T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = (double)s / (1 - v);
        }
        System.out.println(tm);
    }
}
```<|endoftext|>
