<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2

Expected output:
1.12256994


```
# AOJ 1593: Star
# Python3 2018.7.13 bal4u

import math
PI = 3.1415926535897932384626433832795
# area = n*r^2*sin(180/n)*cos(180k/n)*sec(180(k-1)/n), for n/k star
N, K = map(int, input().split())
print(N*math.sin(PI/N)*math.cos(K*PI/N)/math.cos((K-1)*PI/N))

```
[/INST]
```java
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double PI = 3.1415926535897932384626433832795;
        double area = n * Math.sin(PI / n) * Math.cos(k * PI / n) / Math.cos((k - 1) * PI / n);
        System.out.println(area);
    }
}
```</s>
