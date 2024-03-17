<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
a,*b,c = input()
print(a+str(len(b))+c)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        System.out.println(a + String.valueOf(b.length()) + c);
    }
}
```</s>
