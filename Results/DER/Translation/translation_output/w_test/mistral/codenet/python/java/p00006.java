<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
w32nimda

Expected output:
admin23w


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
        String output = new StringBuilder(input).reverse().toString();
        System.out.println(output);
    }
}
```</s>
