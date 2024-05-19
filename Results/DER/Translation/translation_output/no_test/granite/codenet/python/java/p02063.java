System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int k = -(-B / A);
        int _k = k;
        int n = 0;
        while (k < _k + 1000000) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            rem = rem % A;
            n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
            k++;
        }
        System.out.println(-1);
    }
}
```<|endoftext|>
