<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
46979

Expected output:
13:2:59


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

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / 60 / 60;
        int minute = (ss % 60 * 60) / 60;
        int second = ss % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `//` operator is used to perform integer division and get the hour value.
* The `%` operator is used to get the remaining seconds after dividing by 60.
* The `//` operator is used again to get the remaining minutes after dividing by 60.
* The `:` character is used to separate the hour, minute, and second values.
* The `System.out.println()` method is used to print the final result.</s>
