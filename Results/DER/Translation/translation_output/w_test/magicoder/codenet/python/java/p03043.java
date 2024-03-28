<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 10

Expected output:
0.145833333333


```
import math
from fractions import Fraction
N,K=map(int,input().split())
s=0
if N >= K:
  s=s+Fraction(N-K,N)
  d=0
  for i in range(K):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
else:
  d=0
  for i in range(N):
    a=math.log(K/(i+1),2)
    d=d+Fraction(1, 2)**(math.ceil(a))*Fraction(1, N)
print(float(s+d))
  
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1.0)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1.0)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
        }
        System.out.println(s.add(d).setScale(10, RoundingMode.HALF_UP));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the sum of two fractions, and prints the result. The fractions are represented as BigDecimal objects to handle large numbers and precision issues. The scale of the BigDecimal is set to 10 to get the same precision as in the Python code.<｜end▁of▁sentence｜>
