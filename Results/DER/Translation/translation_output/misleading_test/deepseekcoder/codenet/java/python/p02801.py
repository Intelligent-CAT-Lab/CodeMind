<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
a

Expected output:
g

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

### Response:
```python
import sys

def next_char(c):
    switcher = {
        'a': 'b',
        'b': 'c',
        'c': 'd',
        'd': 'e',
        'e': 'f',
        'f': 'g',
        'g': 'h',
        'h': 'i',
        'i': 'j',
        'j': 'k',
        'k': 'l',
        'l': 'm',
        'm': 'n',
        'n': 'o',
        'o': 'p',
        'p': 'q',
        'q': 'r',
        'r': 's',
        's': 't',
        't': 'u',
        'u': 'v',
        'v': 'w',
        'w': 'x',
        'x': 'y',
        'y': 'z'
    }
    return switcher.get(c, "Invalid input")

c = sys.stdin.read(1)
print(next_char(c))
```

This Python code does the same thing as the Java code. It reads a character from standard input, and then uses a dictionary to map the input character to the next character in the alphabet. If the input character is not in the dictionary, it returns "Invalid input".
<|EOT|>
