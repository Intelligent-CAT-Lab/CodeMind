<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
AC

```
A,x,C=input().split()
print("A"+x[0]+"C")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String a = split[0];
        String x = split[1];
        String c = split[2];
        System.out.println(a + x[0] + c);
    }
}
```</s>
