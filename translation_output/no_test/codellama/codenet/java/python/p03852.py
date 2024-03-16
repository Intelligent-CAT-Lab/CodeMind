<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import sys

c = sys.stdin.readline()

if c == "a":
    print("vowel")
elif c == "i":
    print("vowel")
elif c == "u":
    print("vowel")
elif c == "e":
    print("vowel")
elif c == "o":
    print("vowel")
else:
    print("consonant")
```
Note: The `sys` module is used to read input from the standard input stream, and the `readline()` method is used to read a line of input. The `if` statement is used to check if the input is equal to any of the vowels, and the `print()` function is used to print the corresponding output.</s>
