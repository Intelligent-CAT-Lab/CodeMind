<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int result = (s.length() - s.replace("p", "").length()) / 2;
        System.out.println(result);
    }
}
```</s>
