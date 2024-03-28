<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] words = input.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            initials.append(word.charAt(0));
        }
        System.out.println(initials.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, converts it to uppercase, splits it into words, and then prints the initials of each word.<｜end▁of▁sentence｜>
