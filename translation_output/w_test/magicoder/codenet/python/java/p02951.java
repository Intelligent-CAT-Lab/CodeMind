<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 4 3

Expected output:
1


```
A, B, C = map(int, input().split())

get = A - B

i = C - get

if i < 0:
    i = 0
     
print(i)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int get = A - B;

        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}
```

You can test this code with the following test input:

```
6 4 3
```

And it should output:

```
1
```<｜end▁of▁sentence｜>
