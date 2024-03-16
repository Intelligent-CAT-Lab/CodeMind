<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
x = int(raw_input())
print x*x*x
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x * x * x);
    }
}
```</s>
