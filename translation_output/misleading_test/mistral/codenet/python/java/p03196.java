<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 24

Expected output:
-14

```
n,p=map(int,input().split())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(p)
ans=1
for i in range(len(l)):
    if l[i][1]>=n:
        ans*=l[i][0]**(l[i][1]//n)
print(ans)

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        n = sc.nextInt();
        p = sc.nextInt();
        List<int[]> l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1] >= n) {
                ans *= Math.pow(l.get(i)[0], l.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int p) {
        List<int[]> arr = new ArrayList<>();
        int temp = p;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                int cnt = 0;
                while (p % i == 0) {
                    cnt++;
                    p /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }
        if (p != 1) {
            arr.add(new int[]{p, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new int[]{p, 1});
        }
        return arr;
    }
}
```</s>
