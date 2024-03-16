<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
p, m, c = map(int, input().split())
print(p+m+c)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p, m, c;
        p = scanner.nextInt();
        m = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(p + m + c);
    }
}
```</s>
