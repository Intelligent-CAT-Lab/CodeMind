<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
46

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ant = 1, bnt = 1, cnt = 1;

        for (int i = 0; i < n; i++) {
            ant = (ant * 10) % 1000000007;
            bnt = (bnt * 9) % 1000000007;
            cnt = (cnt * 8) % 1000000007;
        }

        long ans = (ant - (bnt * 2 - cnt)) % 1000000007;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```</s>
