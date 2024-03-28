<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
needed

Expected output:
5

```
s=input()
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        print(i+1,i+2)
        exit()
for i in range(len(s)-2):
    if s[i]==s[i+2]:
        print(i+1,i+3)
        exit()
print(-1,-1)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + ", " + (i + 2));
                return;
            }
        }
        for (int i = 0; i < len - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + ", " + (i + 3));
                return;
            }
        }
        System.out.println(-1, -1);
    }
}
```</s>
