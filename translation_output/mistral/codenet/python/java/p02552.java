<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(1 - int(input()))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(1 - scanner.nextInt());
    }
}
```</s>
