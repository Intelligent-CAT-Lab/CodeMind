<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
4


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
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = (int) Math.ceil(C / A);
        int s = 7 * A + B;
        int t = C / s;
        int u = C - s * t;
        int v = (int) Math.ceil(u / A);
        int b = 7 * t + (v <= 7? v : 7);
        System.out.println(Math.max(a, b));
    }
}
```
<|endoftext|>
