<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[:4] + ' ' + s[4:])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```</s>
