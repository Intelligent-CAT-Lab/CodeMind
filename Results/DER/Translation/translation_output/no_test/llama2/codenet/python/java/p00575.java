<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float a = Math.ceil(C / A);
        float s = 7 * A + B;
        float t = C / s;
        float u = C - s * t;
        float v = Math.ceil(u / A);

        if (v <= 7) {
            float b = 7 * t + v;
            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } else {
            float b = 7 * t + 7;
            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}
```
</s>
