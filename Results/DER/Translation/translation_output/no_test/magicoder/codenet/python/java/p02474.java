<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a * b);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, multiplies them together, and prints the result. The `split(" ")` method is used to split the input string into an array of strings, where each string is a word in the input. The `Integer.parseInt(input[i])` method is used to convert each string in the array to an integer.<｜end▁of▁sentence｜>
