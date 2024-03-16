<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.substring(0, 4).equals("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
