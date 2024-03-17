<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java code equivalent to the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60*60);
        int second = ss % (60*60);
        int minute = second / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
```

This Java code reads an integer from the standard input, calculates the equivalent time in hours, minutes, and seconds, and prints the result in the format "hour:minute:second".
<|EOT|>
