<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
tak


```
print(input()[:3])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, 3));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextLine()` method is used to read the entire line of input. Then, we use the `substring()` method to extract the first three characters of the input string. The `substring()` method takes two parameters: the starting index and the ending index of the substring. The ending index is exclusive, so we use `3` as the second parameter to get the first three characters.<｜end▁of▁sentence｜>
