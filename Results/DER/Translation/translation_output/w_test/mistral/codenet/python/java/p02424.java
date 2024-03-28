<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 10

Expected output:
00000000000000000000000000001000
00000000000000000000000000001010
00000000000000000000000000000010


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

        System.out.println("{:032b}".format(a & b));
        System.out.println("{:032b}".format(a | b));
        System.out.println("{:032b}".format(a ^ b));
    }
}
```</s>
