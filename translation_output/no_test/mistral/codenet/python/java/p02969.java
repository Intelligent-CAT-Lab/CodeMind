<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
r=int(input())
print(3*(r**2))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println(3 * (r * r));
    }
}
```</s>
