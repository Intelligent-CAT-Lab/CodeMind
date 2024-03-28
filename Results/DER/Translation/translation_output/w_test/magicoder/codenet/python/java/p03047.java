<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2


```
N,K = map(int,input().split())

print(N-(K-1))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(N - (K - 1));
    }
}
```

This Java code reads two integers from the standard input (console), calculates the result as `N - (K - 1)`, and then prints the result.

You can test this code with the following test input:

```
3 2
```

And the expected output will be:

```
2
```<｜end▁of▁sentence｜>
