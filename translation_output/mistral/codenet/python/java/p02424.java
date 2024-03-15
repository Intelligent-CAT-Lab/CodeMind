<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())

print("{:032b}".format(a & b))
print("{:032b}".format(a | b))
print("{:032b}".format(a ^ b))


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%032b%n", (a & b));
        System.out.printf("%032b%n", (a | b));
        System.out.printf("%032b%n", (a ^ b));
    }
}
```</s>
