<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
27

```
n = int(input())

if n == 1:
    print(1)
else:
    res_v = [0]*(n + 1)
    res_v_cumsum = [0]*(n + 1)
    res_v[0] = 0
    res_v[1] = 1
    res_v[2] = 1
    res_v_cumsum[0] = 0
    res_v_cumsum[1] = 1
    res_v_cumsum[2] = 2

    M = 1000000007

    for k in range(3, n):
        res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M
        res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M
    #print(res_v)
    print((((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M) + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println(1);
        } else {
            int[] res_v = new int[n+1];
            int[] res_v_cumsum = new int[n+1];
            res_v[0] = 0;
            res_v[1] = 1;
            res_v[2] = 1;
            res_v_cumsum[0] = 0;
            res_v_cumsum[1] = 1;
            res_v_cumsum[2] = 2;
            int M = 1000000007;
            for(int k = 3; k <= n; k++) {
                res_v[k] = (1 + res_v_cumsum[k-1] - res_v[k-2]) % M;
                res_v_cumsum[k] = (res_v_cumsum[k-1] + res_v[k]) % M;
            }
            System.out.println((((res_v_cumsum[n-2] * (((n-1) * (n-1)) % M)) % M) + ((res_v_cumsum[n-1] * (n-1)) % M) + n + (n-1)*(n-1)%M) % M);
        }
    }
}
```
'''
<|endoftext|>
