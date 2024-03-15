<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
