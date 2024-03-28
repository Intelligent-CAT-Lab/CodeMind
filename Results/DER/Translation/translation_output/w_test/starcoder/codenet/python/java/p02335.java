<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
10


```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long MOD = 1000000007;
        long ans = 1;
        for(int i = 0; i < n; i++) {
            ans = (ans * (k-i)) % MOD;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
