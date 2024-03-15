<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(input().count('1'))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.next().count('1');
        System.out.println(count);
    }
}
```</s>
