<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int t = 1, n = 1, a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t++;
        }
        System.out.println(t);
    }
}
```
<|endoftext|>
