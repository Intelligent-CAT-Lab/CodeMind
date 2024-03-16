<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(2 * n)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
    }
}
```</s>
