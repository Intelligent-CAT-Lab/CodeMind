<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
o

```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.contains("A") && s.contains("B") ? "Yes" : "No";
        System.out.println(result);
    }
}
```

You can test this code with the following test input:

```
BBA
```

And the expected output will be:

```
Yes
```<｜end▁of▁sentence｜>
