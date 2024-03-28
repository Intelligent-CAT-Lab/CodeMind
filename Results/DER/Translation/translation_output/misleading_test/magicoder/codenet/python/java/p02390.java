<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
```

You can test this code with the following test input:

```
46979
```

And it should output:

```
1:16:19
```<｜end▁of▁sentence｜>
