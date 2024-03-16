Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int) Math.sqrt(N);
        int[] plist = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (N % i == 0) {
                plist[count] = i;
                count++;
                if (i!= N / i) {
                    plist[count] = N / i;
                    count++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < count; i++) {
            int x = plist[i];
            int kari = (int) Math.floor(N / x) - 1;
            if (kari == 0) {
                continue;
            }
            int q = (int) Math.floor(N / kari);
            int r = N % kari;
            if (q == r) {
                ans += kari;
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
