<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print ( chr ( ord ( input ( ) ) + 1 ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = (char) (scanner.nextInt() + 1);
        System.out.println(ch);
    }
}
```</s>
