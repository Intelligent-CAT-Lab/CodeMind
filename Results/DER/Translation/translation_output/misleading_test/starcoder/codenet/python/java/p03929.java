<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 7

Expected output:
8

```
n,k=map(int, input().split())

#11æ®µã§1å¨ããã®ã§ããã¾ã§è¨ç®ãã
r=[]
for i in range(1,12):
    m=0
    for j in range(1,6):
        t = 0
        for x in range(3):
            for y in range(3):
                t += 7*(i+y) + (j+x) - 7
        if t % 11 == k: m += 1
    r.append(m)

a,b=divmod(n,11)
ans = 0
ans += a*sum(r)
if b < 1: ans -= r[-2]
if b < 2: ans -= r[-1]
if b >= 3:
    for i in range(b-2): ans += r[i]
print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] r = new int[12];
        for (int i = 1; i <= 11; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) m++;
            }
            r[i] = m;
        }
        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        ans += a * sum(r);
        if (b < 1) ans -= r[11];
        if (b < 2) ans -= r[10];
        if (b >= 3) {
            for (int i = 0; i < b - 2; i++) ans += r[i];
        }
        System.out.println(ans);
    }

    public static int sum(int[] a) {
        int ans = 0;
        for (int i : a) ans += i;
        return ans;
    }
}
```

'''
<|endoftext|>
