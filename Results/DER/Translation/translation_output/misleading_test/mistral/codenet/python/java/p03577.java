<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE=

```
print(str(input())[:-8])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.substring(0, input.length() - 8);
        System.out.println(output);
    }
}
```</s>
