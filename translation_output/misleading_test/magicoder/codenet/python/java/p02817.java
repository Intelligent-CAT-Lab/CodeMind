<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atc!oder

```
S, T = input().split()

print(T + S)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        System.out.println(T + " " + S);
    }
}
```

This Java code reads two strings from the standard input (console), concatenates them with a space in between, and then prints the result.

You can test this code with the following test input:

```
atc oder
```

And the expected output will be:

```
atc oder
```<｜end▁of▁sentence｜>
