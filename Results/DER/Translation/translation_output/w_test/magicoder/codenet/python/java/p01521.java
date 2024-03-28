<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
s = raw_input()
print 'x' if s[0]=='x' and s[-1]=='x' else 'o'
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') {
            System.out.println('x');
        } else {
            System.out.println('o');
        }
    }
}
```

You can test this code with the following test input:

```
oxxoxoo
```

And the expected output will be:

```
o
```<｜end▁of▁sentence｜>
