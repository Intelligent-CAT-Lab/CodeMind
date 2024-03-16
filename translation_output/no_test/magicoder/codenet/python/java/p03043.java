<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
        BigDecimal d = BigDecimal.ZERO;

        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1.0)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).multiply(new BigDecimal(1.0 / N)));
            }
        } else {
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1.0)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(0.5, Math.ceil(a))).multiply(new BigDecimal(1.0 / N)));
            }
        }

        System.out.println(s.add(d).doubleValue());
    }
}
```

Please note that in Java, we need to use `BigDecimal` for precise arithmetic operations. The `RoundingMode.HALF_UP` is used to round the division result to the nearest number. The `Math.pow` function in Java returns a double, so we need to convert it to `BigDecimal` before multiplication.<｜end▁of▁sentence｜>
