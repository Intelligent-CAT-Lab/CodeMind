<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE FESTIVAL


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
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```</s>
