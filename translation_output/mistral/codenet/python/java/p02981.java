<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }
        System.out.println(ans);
    }
}
```</s>
