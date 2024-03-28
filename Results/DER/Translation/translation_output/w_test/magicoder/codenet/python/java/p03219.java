<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
81 58

Expected output:
110


```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();

        int fare = ab + bc / 2;

        System.out.println(fare);
    }
}
```

You can test this code with the following test input:

```
81 58
```

And it should output:

```
110
```<｜end▁of▁sentence｜>
