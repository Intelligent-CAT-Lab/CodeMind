<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
4


```
R, G, B, n = map(int, input().split())
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, G, B, n;
        R = sc.nextInt();
        G = sc.nextInt();
        B = sc.nextInt();
        n = sc.nextInt();
        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
```
'''
<|endoftext|>
