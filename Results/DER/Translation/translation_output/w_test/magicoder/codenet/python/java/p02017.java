<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
No


```
H, W, X, Y = map(int, input().split())

if ((H * W) * (X + Y)) % 2:
    print('No')
else:
    print('Yes')

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if ((H * W) * (X + Y) % 2 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

You can test this code with the following test input:

```
3 5 1 4
```

And it should output:

```
No
```<｜end▁of▁sentence｜>
