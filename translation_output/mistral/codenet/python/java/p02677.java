<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,H,M = list(map(int,input().split()))

import math

l = H*360/12 + M*30/60
s = M*360/60
ang = abs(l-s)
c = A**2 + B**2 -2*B*A*math.cos(math.radians(ang))
print(math.sqrt(c))
```
[/INST]
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, H, M;
        A = sc.nextInt();
        B = sc.nextInt();
        H = sc.nextInt();
        M = sc.nextInt();

        int l = (H * 360 / 12) + (M * 30 / 60);
        int s = (M * 360 / 60);
        double ang = Math.abs(l - s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```</s>
