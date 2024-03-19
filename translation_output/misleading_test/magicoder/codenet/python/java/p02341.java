<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-50

```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n <= k) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```

You can test this code with the following test input:

```
5 10
```

And it should output:

```
1
```<｜end▁of▁sentence｜>
