<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int ans = Math.min(B, D) - Math.max(A, C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
