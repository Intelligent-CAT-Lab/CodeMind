<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print(a + a ** 2 + a ** 3)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + a * a + a * a * a);
    }
}
```</s>
