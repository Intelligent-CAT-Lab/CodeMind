<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2

Expected output:
17.03547958208997

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
import java.lang.Math;

public class Star {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int K = Integer.parseInt(args[1]);
        double PI = 3.1415926535897932384626433832795;
        double area = N * Math.pow(Math.sin(PI / N), 2) * Math.cos(K * PI / N) * Math.cos((K - 1) * PI / N);
        System.out.println(area);
    }
}
```
Note: The code uses the `Math` class to perform mathematical operations, such as `sin`, `cos`, and `pow`. The `Integer.parseInt` method is used to convert the input strings to integers.</s>
