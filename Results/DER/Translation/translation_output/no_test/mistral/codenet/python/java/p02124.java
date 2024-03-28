<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print("ai1333" + "3" * int(int(input()) / 100))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input) / 100;
        String output = "ai1333" + "3" * num;
        System.out.println(output);
    }
}
```</s>
