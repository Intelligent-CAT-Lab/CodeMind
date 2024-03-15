<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, p;
        a = scanner.nextInt();
        p = scanner.nextInt();
        System.out.println((3 * a + p) / 2);
    }
}
```</s>
