<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[::2])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() - 1));
    }
}
```</s>
