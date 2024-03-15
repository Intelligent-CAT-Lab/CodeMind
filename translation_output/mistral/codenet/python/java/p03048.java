<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, G, B, n;
        n = sc.nextInt();
        R = sc.nextInt();
        G = sc.nextInt();
        B = sc.nextInt();
        int cnt = 0;
        for (int r = 0; r < n / R + 1; r++) {
            for (int g = 0; g < (n - r * R) / G + 1; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
```</s>
