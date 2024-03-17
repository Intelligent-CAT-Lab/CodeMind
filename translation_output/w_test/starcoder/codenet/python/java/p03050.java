<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
10


```
#Dåé¡
#Dåé¡
import math
N=int(input())
n=int(math.sqrt(N))
plist=[]
for i in range(1,n+1):
    if N%i == 0:
        plist.append(i)
        if i!= int(N/i):
            plist.append(int(N/i))
ans=0
for i in range(len(plist)):
    x=plist[i]
    kari=int(N/x)-1
    if kari == 0:
        pass
    else:
        q=int(N/kari)
        r=N%kari
        if q == r:
            ans+=kari
print(ans)
            

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[i - 1] = i;
                if (i!= N / i) {
                    plist[n - 1] = N / i;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int x = plist[i];
            int kari = (int) (N / x) - 1;
            if (kari == 0) {
                continue;
            }
            int q = (int) (N / kari);
            int r = N % kari;
            if (q == r) {
                ans += kari;
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
