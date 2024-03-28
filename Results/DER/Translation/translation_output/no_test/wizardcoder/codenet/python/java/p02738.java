Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        BigInteger[][] d = new BigInteger[l][n * 5];
        d[0][0] = BigInteger.ONE;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int x = 0; x < n * 5; x++) {
                d[i][x] = ((d[i - 3][x] == null? BigInteger.ZERO : d[i - 3][x]).multiply(BigInteger.valueOf(k)).add(BigInteger.valueOf(d[k][(x - 1 + n * 5) % (n * 5)]).mod(BigInteger.valueOf(M)))).multiply(BigInteger.valueOf(j)).add(BigInteger.valueOf(d[j][(x + 1) % (n * 5)]).mod(BigInteger.valueOf(M))).mod(BigInteger.valueOf(M));
            }
        }
        BigInteger sum = BigInteger.ZERO;
        for (int x = 0; x < n * 5; x++) {
            sum = sum.add(BigInteger.valueOf(d[l - 1][x]).mod(BigInteger.valueOf(M)));
        }
        System.out.println(sum.mod(BigInteger.valueOf(M)));
    }
}
```<|endoftext|>
