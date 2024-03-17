<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE


```
print(str(input())[:-8])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, input.length() - 8));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. We then use the `substring` method to extract the substring from the input string. The `substring` method takes two parameters: the starting index and the ending index. The ending index is calculated as the length of the string minus 8. This is because we want to remove the last 8 characters from the string.<｜end▁of▁sentence｜>
