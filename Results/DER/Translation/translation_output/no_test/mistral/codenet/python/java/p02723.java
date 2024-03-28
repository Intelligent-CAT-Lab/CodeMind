<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
