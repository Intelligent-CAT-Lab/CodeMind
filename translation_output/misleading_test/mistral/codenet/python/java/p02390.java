<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
46979

Expected output:
Nwi{:s}

```
ss = int(input())
hour = ss // 60**2
second = ss % 60**2
minute = second // 60
second = second % 60
print('{}:{}:{}'.format(hour, minute, second))

```
[/INST]
```java
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int minute = ss % (60 * 60) / 60;
        int second = ss % (60 * 60) % 60;
        System.out.println("{}:{}:{}".formatted(hour, minute, second));
    }
}
```</s>
