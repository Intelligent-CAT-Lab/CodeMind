System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n=int(input())
ant,bnt,cnt=1,1,1

for i in range(n) :
    ant=10*ant%1000000007
    bnt=9*bnt%1000000007
    cnt=8*cnt%1000000007

ans=(ant-(bnt*2-cnt))%1000000007

if ans>=0 :
    print(ans)
else :
    print(1000000007+ans) 
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ant = 1, bnt = 1, cnt = 1;
        long mod = 10000000007L;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % mod;
            bnt = (9 * bnt) % mod;
            cnt = (8 * cnt) % mod;
        }

        long ans = (ant - (2 * bnt - cnt) + mod) % mod;
        System.out.println(ans);
    }
}
```<|endoftext|>
