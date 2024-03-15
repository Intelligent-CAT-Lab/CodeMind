<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
num = int(input())

print(num * 32)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num * 32);
    }
}
```</s>
