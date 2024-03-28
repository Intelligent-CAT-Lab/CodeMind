<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A

Expected output:
T


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

This Java code does the same thing as the Python code you provided. It reads a character from the user input, and then prints the complementary nucleotide. If the input is 'A', it prints 'T'. If the input is 'C', it prints 'G'. If the input is 'G', it prints 'C'. If the input is anything else, it prints 'A'.<｜end▁of▁sentence｜>
