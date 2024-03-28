<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
68

Expected output:
19


```
x = input()
x = int(x)
y = (x-30)/2
print(int(y))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = (x - 30) / 2;
        System.out.println(y);
    }
}
```

You can test this code with the following test input:

```
68
```

And the expected output will be:

```
19
```<｜end▁of▁sentence｜>
