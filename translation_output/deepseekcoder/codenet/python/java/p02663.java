<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int k = scanner.nextInt();

        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;

        System.out.println(t2-t1-k);
    }
}
```

This Java code does the same thing as your Python code. It reads five integers from the standard input (which should be separated by spaces), calculates the time in minutes from the first two (`h1` and `m1`) and the second two (`h2` and `m2`), and then prints the difference between `t2` and `t1` minus `k`.
<|EOT|>
