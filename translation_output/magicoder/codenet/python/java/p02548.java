<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

cnt = 0
for a in range(1, n):
    for b in range(1, n):
        x = a * b
        if x >= n:
            break
        cnt += 1

print(cnt)            

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int x = a * b;
                if (x >= n) {
                    break;
                }
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
```<｜end▁of▁sentence｜>
