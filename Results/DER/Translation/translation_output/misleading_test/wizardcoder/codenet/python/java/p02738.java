Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
-61

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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int x = 0; x < n * 5; x++) {
                d[i][x] = ((d[i - 3][x] * k + d[k][(x - 1 + n * 5) % (n * 5)]) * j + d[j][(x + 1) % (n * 5)]) % M;
            }
        }
        long sum = 0;
        for (int x = 0; x < n * 5; x++) {
            sum += d[l - 1][x];
            sum %= M;
        }
        System.out.println(sum);
    }
}
```<|endoftext|>
