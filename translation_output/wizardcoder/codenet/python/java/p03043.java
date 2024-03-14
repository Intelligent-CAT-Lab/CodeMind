Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), MathContext.DECIMAL64));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(2, Math.ceil(a))).divide(new BigDecimal(N), MathContext.DECIMAL64));
            }
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(2, Math.ceil(a))).divide(new BigDecimal(N), MathContext.DECIMAL64));
            }
        }

        System.out.println(s.add(d).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
}
```<|endoftext|>
