<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(n <= k ? 1 : 0);
    }
}
```</s>
