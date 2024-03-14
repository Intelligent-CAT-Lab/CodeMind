<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = new BigDecimal(0);
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < K; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(new BigDecimal(Math.pow(0.5, a.toBigInteger().add(BigInteger.ONE).intValue())).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(s.add(d).setScale(10, RoundingMode.HALF_UP).toString());
        } else {
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < N; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(new BigDecimal(Math.pow(0.5, a.toBigInteger().add(BigInteger.ONE).intValue())).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(d.setScale(10, RoundingMode.HALF_UP).toString());
        }
    }
}
```

Please note that in Java, we use BigDecimal for precise calculations. The scale parameter in the divide method is used to specify the number of digits after the decimal point. The RoundingMode.HALF_UP is used to round the number towards the "nearest neighbor" unless both neighbors are equidistant, in which case round up.
<|EOT|>
