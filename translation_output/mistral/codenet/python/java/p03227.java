<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            System.out.println(l.substring(0, l.length() - 1).reverse());
        }
    }
}
```</s>
