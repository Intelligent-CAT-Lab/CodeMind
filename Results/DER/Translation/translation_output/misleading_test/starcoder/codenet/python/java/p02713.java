<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
20

```
from math import gcd
K = int(input())
ans = 0

for a in range(1, K+1):
    for b in range(1, K+1):
        for c in range(1, K+1):
            ans += gcd(gcd(a, b), c)

print(ans)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;
        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += Math.gcd(Math.gcd(a, b), c);
                }
            }
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
