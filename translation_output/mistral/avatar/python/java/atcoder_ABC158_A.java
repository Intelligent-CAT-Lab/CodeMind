<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = " Yes ".equals(s.contains(" A ")) && s.contains(" B ") ? " Yes " : " No ";
        System.out.println(result);
    }
}
```</s>
