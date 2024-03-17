<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29

Expected output:
Yes


```
if '9' in input():
    print('Yes')
else:
    print('No')
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);

        if (numberString.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads an integer from the user, converts it to a string, and then checks if the string contains the character '9'. If it does, it prints 'Yes'; otherwise, it prints 'No'.<｜end▁of▁sentence｜>
