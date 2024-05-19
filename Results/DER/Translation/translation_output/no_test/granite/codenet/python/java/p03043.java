System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        BigDecimal d = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(BigDecimal.valueOf(N - K).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            for (int i = 0; i < K; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1.0)) / Math.log(2)).setScale(0, BigDecimal.ROUND_CEILING);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            }
        } else {
            for (int i = 0; i < N; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1.0)) / Math.log(2)).setScale(0, BigDecimal.ROUND_CEILING);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            }
        }
        System.out.println(s.add(d).doubleValue());
    }
}
```<|endoftext|>
