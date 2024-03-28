<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N, M = map(int, input().split())
a = []
for i in range(M):
    a.append(int(input()))
num = N - M
ans = 0
while(num):
    ans += 1
    num -= 1
print(ans - 1)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans += 1;
            num -= 1;
        }
        System.out.println(ans - 1);
    }
}
```<｜end▁of▁sentence｜>
