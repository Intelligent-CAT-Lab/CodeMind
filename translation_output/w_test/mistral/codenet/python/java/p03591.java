<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Yes


```
S = input()
print('Yes' if S[:4] == 'YAKI' else 'No')
```
[/INST]
```java
import java.util.Scanner;

public class Yakiniku {
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
