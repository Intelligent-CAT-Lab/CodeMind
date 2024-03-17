<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```

This Java code uses the `Scanner` class to read input from the user. It then checks if the last character of the input string is 's'. If it is, it appends 'es' to the string and prints the result. If the last character is not 's', it appends 's' to the string and prints the result.<｜end▁of▁sentence｜>
