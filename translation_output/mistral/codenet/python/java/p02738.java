<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        int[][] d = new int[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            d[i] = ((d[i - 3] * k + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        System.out.println(sum(d[-1]) % M);
    }

    public static int roll(int[] arr, int k) {
        int temp = arr[k];
        for (int i = k + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr[0];
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```</s>
