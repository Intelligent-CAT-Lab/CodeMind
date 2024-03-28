<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
863

```
s = input()
print(700+100*s.count("o"))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = 700 + 100 * s.count("o");
        System.out.println(result);
    }
}
```</s>
