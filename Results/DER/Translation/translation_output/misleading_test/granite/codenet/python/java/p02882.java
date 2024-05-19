System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
89.30459144318536

```
a,b,x = map(int,input().split())

import math

# ans =math.degrees(math.atan(a*(b**2)/(2*x)))
h = x/a**2


if h>=b/2:
    V = 2*((a**2)*b - x)/a**3
    ans = math.degrees(math.atan(V))
else:
    V=a*(b**2)/(2*x)
    ans =math.degrees(math.atan(V))

print(ans)
```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double ans = 0;
        double h = x/(a*a);
        if(h>=(b/2)){
            double V = 2*((a*a)*b - x)/(a*a*a);
            ans = Math.atan(V);
        }
        else{
            double V = a*(b*b)/(2*x);
            ans = Math.atan(V);
        }
        ans = Math.toDegrees(ans);
        System.out.println(ans);
    }
}
```

Test input:
2 2 4

Expected output:
89.30459144318536<|endoftext|>
