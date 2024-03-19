<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
-92

```
s=input()
print(len(s)//2-s.count('p'))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = (s.length() - 1) / 2 - s.count('p');
        System.out.println(result);
    }
}
```</s>
