<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 12

Expected output:
80

```
a,b = map(int,input().split())

print((a + b) % 24)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (a + b) % 24;
        System.out.println(result);
    }
}
```</s>
