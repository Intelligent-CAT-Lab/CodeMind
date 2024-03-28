<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println('A');
        } else {
            System.out.println('B');
        }
    }
}
```

You can test this code with the following test input:

```
5 2 7
```

And it will output:

```
B
```<｜end▁of▁sentence｜>
