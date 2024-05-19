System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
Here's the Java code for the given Python code:

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
            d[i][0] = ((d[i - 3][0] * k + d[k][n * 4]) * j + d[j][1]) % M;
            for (int m = 1; m < n * 5; m++) {
                d[i][m] = d[i][m - 1];
            }
            d[i][n * 4] = d[i - 3][0];
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n * 5; j++) {
                sum += d[i][j];
                sum %= M;
            }
        }
        System.out.println(sum);
    }
}
```

You can test the code with the following test case:

```
1 998244353
```

The expected output is:

```
-61
```<|endoftext|>
