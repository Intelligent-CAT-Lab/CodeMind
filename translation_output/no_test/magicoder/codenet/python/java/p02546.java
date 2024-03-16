<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == 's') {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```

This Java code does the same thing as the Python code. It prompts the user to enter a word, then checks if the last character of the word is 's'. If it is, it appends 'es' to the word. If it's not, it appends 's'.<｜end▁of▁sentence｜>
