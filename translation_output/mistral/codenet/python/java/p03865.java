<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        } else {
            if (s.length() % 2 == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
```</s>
