<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
s = 180 * (n - 2)
print(s)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```</s>
