<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
win


```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```

You can test this code with the following test input:

```
5 7 9
```

And it will output:

```
win
```<｜end▁of▁sentence｜>
