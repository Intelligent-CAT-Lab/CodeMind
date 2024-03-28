<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
40


```
p, m, c = map(int, input().split())
print(p+m+c)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(p + m + c);
    }
}
```

You can test this code with the following test input:

```
10 10 20
```

And it will output:

```
40
```<｜end▁of▁sentence｜>
