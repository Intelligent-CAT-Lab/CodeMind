<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(BigDecimal.valueOf(N - K).divide(BigDecimal.valueOf(N), MathContext.DECIMAL128));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                BigDecimal a = BigDecimal.log(BigDecimal.valueOf(K).divide(BigDecimal.valueOf(i + 1), MathContext.DECIMAL128), 2);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2), MathContext.DECIMAL128).pow(BigDecimal.ceil(a), MathContext.DECIMAL128).multiply(BigDecimal.ONE.divide(BigDecimal.valueOf(N), MathContext.DECIMAL128)));
            }
        } else {
            d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                BigDecimal a = BigDecimal.log(BigDecimal.valueOf(K).divide(BigDecimal.valueOf(i + 1), MathContext.DECIMAL128), 2);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2), MathContext.DECIMAL128).pow(BigDecimal.ceil(a), MathContext.DECIMAL128).multiply(BigDecimal.ONE.divide(BigDecimal.valueOf(N), MathContext.DECIMAL128)));
            }
        }
        System.out.println(s.add(d).toPlainString());
    }
}
```</s>
