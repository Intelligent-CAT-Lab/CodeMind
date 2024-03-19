<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ani

Expected output:
squareo1001

```
print('square1001' if input()=='ani' else 'e869120')


```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("ani")) {
            System.out.println("square1001");
        } else {
            System.out.println("e869120");
        }
    }
}
```

You can test this code with the following test input:

```
ani
```

And it will output:

```
square1001
```<｜end▁of▁sentence｜>
