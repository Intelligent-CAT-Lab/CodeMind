<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[::-1])

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = input.substring(0, input.length() - 1).reverse();
        System.out.println(reversed);
    }
}
```</s>
