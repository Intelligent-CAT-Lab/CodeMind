Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        int T, s, q, v, tm, t;
        T = sc.nextInt();
        s = sc.nextInt();
        q = sc.nextInt();
        v = (q - 1) / q;
        tm = 1;
        t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm++;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
```<|endoftext|>
