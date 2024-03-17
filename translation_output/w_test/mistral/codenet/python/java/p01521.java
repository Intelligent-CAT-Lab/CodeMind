<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println("x");
        } else {
            System.out.println("o");
        }
    }
}
```</s>
