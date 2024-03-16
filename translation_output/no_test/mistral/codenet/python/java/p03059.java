<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, t = map(int, input().split())
print((t // a) * b)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, t;
        a = scanner.nextInt();
        b = scanner.nextInt();
        t = scanner.nextInt();
        System.out.println((t / a) * b);
    }
}
```</s>
