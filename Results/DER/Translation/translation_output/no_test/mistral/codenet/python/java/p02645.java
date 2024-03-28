<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[:3])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.nextLine().substring(0, 3));
    }
}
```</s>
