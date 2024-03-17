<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 4

Expected output:
45.0000000000


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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = (double)x/a*a;
        if(h>=b/2){
            double V = 2*((a*a)*b - x)/a*a*a;
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
        else{
            double V = a*(b*b)/(2*x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}
```
<|endoftext|>
