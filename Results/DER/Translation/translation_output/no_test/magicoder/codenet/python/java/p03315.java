<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = countChar(a, '+');
        int f = countChar(a, '-');
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

This Java code does the same thing as the Python code. It reads a line of input from the user, counts the number of '+' characters and the number of '-' characters, and then prints the difference between the two. The `countChar` method is a helper method that counts the number of occurrences of a specific character in a string.<｜end▁of▁sentence｜>
