<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = str(input())
print("ABC"+s)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
    }
}
```</s>
