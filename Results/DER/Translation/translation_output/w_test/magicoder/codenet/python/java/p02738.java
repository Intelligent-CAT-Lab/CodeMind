<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
6


```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long M = sc.nextLong();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1, k = i - 2;
            d[i] = ((d[i - 3][k] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum = (sum + d[l - 1][i]) % M;
        }
        System.out.println(sum);
    }

    public static long[] roll(long[] arr, int shift) {
        int len = arr.length;
        shift = (shift % len + len) % len;
        long[] res = new long[len];
        System.arraycopy(arr, 0, res, shift, len - shift);
        System.arraycopy(arr, len - shift, res, 0, shift);
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `M` from the input, calculates `l` as `n * 3 + 1`, initializes a 2D array `d` with size `l` by `n * 5`, sets `d[0][0]` to 1, and then fills the rest of the array using a loop. After that, it calculates the sum of the last row of `d` modulo `M` and prints the result.

The `roll` function is a helper function that shifts the elements of an array to the left by a certain number of positions. It is used to implement the `roll(d[k], -1)` and `roll(d[j], 1)` operations in the Python code.<｜end▁of▁sentence｜>
