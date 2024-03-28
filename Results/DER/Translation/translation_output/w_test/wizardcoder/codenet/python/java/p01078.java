Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double PI = 3.1415926535897932384626433832795;
        double area = N * Math.pow(1.0*N/K, 2) * Math.sin(PI/N) * Math.cos(K*PI/N) / Math.cos((K-1)*PI/N);
        System.out.printf("%.6f", area);
    }
}
```

Explanation:

In Java, we can use the `Math` class to access various mathematical functions and constants. In this solution, we use the `pow()` function to calculate the value of `N/K` raised to the power of 2. We also use the `sin()`, `cos()`, and `tan()` functions to calculate the sine, cosine, and tangent of angles, respectively. Finally, we use the formula for the area of a `n/k` star to calculate the area of the star. We use `printf()` to format the output to 6 decimal places.<|endoftext|>
