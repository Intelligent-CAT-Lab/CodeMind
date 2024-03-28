<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ss = sc.nextInt();
        int hour = ss / 60**2;
        int second = ss % 60**2;
        int minute = second / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
```

'''
<|endoftext|>
