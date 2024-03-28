<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 9 0

Expected output:
5.00000000000000000000


```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        double l = H*360/12 + M*30/60;
        double s = M*360/60;
        double ang = Math.abs(l-s);
        double c = A*A + B*B - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```
'''
<|endoftext|>
