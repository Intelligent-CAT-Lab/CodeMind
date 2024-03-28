<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
270


```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextIntArray(5);
        int h1 = input[0];
        int m1 = input[1];
        int h2 = input[2];
        int m2 = input[3];
        int k = input[4];

        int t1 = h1 * 60 + m1;
        int t2 = h2 * 60 + m2;

        System.out.println(t2 - t1 - k);
    }
}
```</s>
