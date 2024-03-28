<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / 60 / 60;
        int minute = (ss % 60 * 60) / 60;
        int second = ss % 60;
        System.out.println(String.format("%d:%d:%d", hour, minute, second));
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `String.format()` method is used to format the output as a string.</s>
