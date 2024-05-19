System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 0 10

Expected output:
-68

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


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();
        double a=Math.ceil(C/A);
        double s=7*A+B;
        double t=C/s;
        double u=C-s*t;
        double v=Math.ceil(u/A);
        double b=0;
        if(v<=7)
        {
            b=7*t+v;
        }
        else
        {
            b=7*t+7;
        }
        if(a>b)
        {
            System.out.println((int)b);
        }
        else
        {
            System.out.println((int)a);
        }
    }
}
```

Test input:
3 0 10

Expected output:
-68<|endoftext|>
