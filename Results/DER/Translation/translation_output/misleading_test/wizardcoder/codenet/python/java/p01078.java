Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double area = N * Math.pow(180/N, 2) * Math.sin(PI/N) * Math.cos(K*PI/N) / Math.cos((K-1)*PI/N);
        System.out.printf("%.5f", area);
    }
}
```<|endoftext|>
