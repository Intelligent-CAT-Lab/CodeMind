<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math as m
A,B,C=(float(x) for x in input().split())

a=m.ceil(C/A)

s=7*A+B
t=C//s
#sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
u=C-s*t
#uã¯ç«¯æ°
v=m.ceil(u/A)

if v<=7:
    b=7*t+v
    
else:
    b=7*t+7
    
if a>b:
    print(int(b))
else:
    print(int(a))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double a = Math.ceil(C / A);
        double s = 7 * A + B;
        double t = C / s;
        double u = C - s * t;
        double v = Math.ceil(u / A);
        if (v <= 7) {
            double b = 7 * t + v;
            if (a > b) {
                System.out.println(Math.toIntExact(b));
            } else {
                System.out.println(Math.toIntExact(a));
            }
        } else {
            double b = 7 * t + 7;
            if (a > b) {
                System.out.println(Math.toIntExact(b));
            } else {
                System.out.println(Math.toIntExact(a));
            }
        }
    }
}
```
<|endoftext|>
