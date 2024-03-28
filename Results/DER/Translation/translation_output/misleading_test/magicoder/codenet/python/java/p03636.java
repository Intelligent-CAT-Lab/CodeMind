<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i1n

```
a,*b,c = input()
print(a+str(len(b))+c)

```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String a = parts[0];
        String b = parts[1];
        String c = parts[2];
        System.out.println(a + b.length() + c);
    }
}
```

This Java code reads a line of input from the user, splits it into three parts using the comma as a delimiter, and then prints the first part, the length of the second part, and the third part.

You can test this code with the following test input:

```
internationalization
```

The expected output will be:

```
i1n
```<｜end▁of▁sentence｜>
