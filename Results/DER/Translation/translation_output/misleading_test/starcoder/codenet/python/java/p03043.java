<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double s = 0;
        if (N >= K) {
            s = s + (N - K) / (double) N;
            double d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1), 2);
                d = d + Math.pow(0.5, Math.ceil(a)) / N;
            }
        } else {
            double d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1), 2);
                d = d + Math.pow(0.5, Math.ceil(a)) / N;
            }
        }
        System.out.println(s + d);
    }
}
```
<|endoftext|>
