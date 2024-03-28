<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 900

Expected output:
Yes


```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (500 * K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can test this code with the following test input:

```
2 900
```

And it should output:

```
Yes
```<｜end▁of▁sentence｜>
