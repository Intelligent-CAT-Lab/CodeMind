<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        double s=0;
        if(N>=K){
            s=s+(N-K)/N;
            double d=0;
            for(int i=0;i<K;i++){
                double a=Math.log(K/(i+1),2);
                d=d+(1/(2*Math.pow(2,Math.ceil(a))))/(N);
            }
        }
        else{
            double d=0;
            for(int i=0;i<N;i++){
                double a=Math.log(K/(i+1),2);
                d=d+(1/(2*Math.pow(2,Math.ceil(a))))/(N);
            }
        }
        System.out.printf("%.2f",s+d);
    }
}
```
<|endoftext|>
