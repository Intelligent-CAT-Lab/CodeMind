<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
2


```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int e = countChar(input, '+');
        int f = countChar(input, '-');
        System.out.println(e - f);
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

This Java code reads a line of input from the user, counts the number of '+' characters and the number of '-' characters, and then prints the difference. The `countChar` method is a helper method that counts the number of occurrences of a specific character in a string.<｜end▁of▁sentence｜>
