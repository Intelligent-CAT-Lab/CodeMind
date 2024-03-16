<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print ( input ( ) . replace ( " , " , " â " ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(",", " â ");
        System.out.println(output);
    }
}
```</s>
