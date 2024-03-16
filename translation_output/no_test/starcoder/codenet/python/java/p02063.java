<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B%A == 0) {
            System.out.println(-1);
            return;
        }
        int k = -(-B/A);
        for (int i = k; i < k + 10000000; i++) {
            int bn = i/A;
            int rem = i%A;
            int an = rem/B;
            int n = bn + an + rem;
            if (n > i) {
                System.out.println(i*A);
                return;
            }
        }
        System.out.println(-1);
    }
}
```
<|endoftext|>
