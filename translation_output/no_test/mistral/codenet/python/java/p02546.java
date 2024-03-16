<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```</s>
