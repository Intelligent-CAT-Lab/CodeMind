System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double s = 0;
        if (N >= K) {
            s += (double) (N - K) / N;
            double d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log((double) K / (i + 1)) / Math.log(2);
                d += Math.pow(0.5, Math.ceil(a)) / N;
            }
        } else {
            double d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log((double) K / (i + 1)) / Math.log(2);
                d += Math.pow(0.5, Math.ceil(a)) / N;
            }
        }
        System.out.println(s + d);
    }
}
```<|endoftext|>
