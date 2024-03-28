<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char b = scanner.next().charAt(0);
        if (b == 'A') {
            System.out.println('T');
        } else if (b == 'C') {
            System.out.println('G');
        } else if (b == 'G') {
            System.out.println('C');
        } else {
            System.out.println('A');
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a character from the user, and then prints the complementary nucleotide. If the input is 'A', it prints 'T', if it's 'C', it prints 'G', if it's 'G', it prints 'C', and if it's anything else, it prints 'A'.<｜end▁of▁sentence｜>
