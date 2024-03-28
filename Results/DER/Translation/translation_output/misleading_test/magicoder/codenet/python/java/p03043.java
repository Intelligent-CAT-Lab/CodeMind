<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 10

Expected output:
71.6240279555314

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
Here is the Java version of the provided Python code:

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
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(s.add(d).setScale(10, RoundingMode.HALF_UP));
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(d.setScale(10, RoundingMode.HALF_UP));
        }
    }
}
```

Please note that Java does not have a built-in Fraction class like Python's fractions module. So, I used BigDecimal to represent fractions. Also, the precision of the output is set to 10 decimal places.<｜end▁of▁sentence｜>
