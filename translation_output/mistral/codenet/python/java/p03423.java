<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print( int(input()) // 3)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num / 3;
        System.out.println(result);
    }
}
```</s>
