<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A

Expected output:


```
b=input()
if b =='A':
    print('T')
elif b=='C':
    print('G')
elif b=='G':
    print('C')
else:
    print('A')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        if (b.equals("A")) {
            System.out.println('T');
        } else if (b.equals("C")) {
            System.out.println('G');
        } else if (b.equals("G")) {
            System.out.println('C');
        } else {
            System.out.println('A');
        }
    }
}
```

This Java code reads a character from the standard input (console), and then checks if it's 'A', 'C', 'G', or any other character. Depending on the input, it prints the corresponding character.<｜end▁of▁sentence｜>
