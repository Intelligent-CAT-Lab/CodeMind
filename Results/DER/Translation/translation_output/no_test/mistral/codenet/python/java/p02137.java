<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(int(int(input()) // 500 * 500))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num / 500 * 500;
        System.out.println(result);
    }
}
```</s>
