<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```<｜end▁of▁sentence｜>
