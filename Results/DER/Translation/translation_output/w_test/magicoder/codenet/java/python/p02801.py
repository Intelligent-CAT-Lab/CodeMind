<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a

Expected output:
b


```
import java.util.*;

public class p02801{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        char c = s.charAt(0);
        char out;
        switch(c){
            case 'a':
                out = 'b';
                System.out.println(out);
                break;
            case 'b':
                out = 'c';
                System.out.println(out);
                break;
            case 'c':
                out = 'd';
                System.out.println(out);
                break;
            case 'd':
                out = 'e';
                System.out.println(out);
                break;
            case 'e':
                out = 'f';
                System.out.println(out);
                break;
            case 'f':
                out = 'g';
                System.out.println(out);
                break;
            case 'g':
                out = 'h';
                System.out.println(out);
                break;
            case 'h':
                out = 'i';
                System.out.println(out);
                break;
            case 'j':
                out = 'k';
                System.out.println(out);
                break;
            case 'k':
                out = 'l';
                System.out.println(out);
                break;
            case 'l':
                out = 'm';
                System.out.println(out);
                break;
            case 'm':
                out = 'n';
                System.out.println(out);
                break;
            case 'n':
                out = 'o';
                System.out.println(out);
                break;
            case 'o':
                out = 'p';
                System.out.println(out);
                break;
            case 'p':
                out = 'q';
                System.out.println(out);
                break;
            case 'q':
                out = 'r';
                System.out.println(out);
                break;
            case 'r':
                out = 's';
                System.out.println(out);
                break;
            case 's':
                out = 't';
                System.out.println(out);
                break;
            case 't':
                out = 'u';
                System.out.println(out);
                break;
            case 'u':
                out = 'v';
                System.out.println(out);
                break;
            case 'v':
                out = 'w';
                System.out.println(out);
                break;
            case 'w':
                out = 'x';
                System.out.println(out);
                break;
            case 'x':
                out = 'y';
                System.out.println(out);
                break;
            case 'y':
                out = 'z';
                System.out.println(out);
                break;
        }
    }
}
```

@@ Response
```python
import sys

def next_char(c):
    return chr(ord(c) + 1)

def main():
    s = sys.stdin.readline().strip()
    c = s[0]
    out = next_char(c)
    print(out)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a character from the standard input, increments it by one using the `next_char` function, and then prints the result. The `next_char` function uses the `ord` function to get the ASCII value of the character, increments it by one, and then uses the `chr` function to convert it back to a character.<｜end▁of▁sentence｜>
