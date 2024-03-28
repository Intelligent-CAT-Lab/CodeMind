<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
a_index = 0
z_index = 0
for i in range(len(s)):
    if s[i] == 'A':
        a_index = i
        break
for i in range(len(s) - 1, 0, -1):
    if s[i] == 'Z':
        z_index = i
        break
print(z_index - a_index + 1)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a_index = 0;
        int z_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        System.out.println(z_index - a_index + 1);
    }
}
```</s>
