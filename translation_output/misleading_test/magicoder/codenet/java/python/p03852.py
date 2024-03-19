<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a

Expected output:
vowel

```
import java.util.Scanner;

public class  p03852{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();

        if (c.equals("a")) {
            System.out.println("vowel");
        } else if (c.equals("i")) {
            System.out.println("vowel");
        } else if (c.equals("u")) {
            System.out.println("vowel");
        } else if (c.equals("e")) {
            System.out.println("vowel");
        } else if (c.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}
```

@@ Response
```python
c = input()

if c == "a" or c == "i" or c == "u" or c == "e" or c == "o":
    print("vowel")
else:
    print("consonant")
```

This Python code does the same thing as the Java code. It reads a character from the user and checks if it is a vowel (a, i, u, e, o). If it is, it prints "vowel". If it's not, it prints "consonant".<｜end▁of▁sentence｜>
