<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes

```
n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n.charAt(i))) % 9;
        }
        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
