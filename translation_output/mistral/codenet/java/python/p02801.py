<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
# Python implementation of the given Java code

# Importing required libraries
import sys

# Taking input from the user
input_str = input("Enter a string: ")

# Getting the first character of the input string
char = input_str[0]

# Initializing the output character
output_char = ''

# Using a switch statement to determine the output character based on the input character
if char == 'a':
    output_char = 'b'
elif char == 'b':
    output_char = 'c'
elif char == 'c':
    output_char = 'd'
elif char == 'd':
    output_char = 'e'
elif char == 'e':
    output_char = 'f'
elif char == 'f':
    output_char = 'g'
elif char == 'g':
    output_char = 'h'
elif char == 'h':
    output_char = 'i'
elif char == 'i':
    output_char = 'j'
elif char == 'j':
    output_char = 'k'
elif char == 'k':
    output_char = 'l'
elif char == 'l':
    output_char = 'm'
elif char == 'm':
    output_char = 'n'
elif char == 'n':
    output_char = 'o'
elif char == 'o':
    output_char = 'p'
elif char == 'p':
    output_char = 'q'
elif char == 'q':
    output_char = 'r'
elif char == 'r':
    output_char = 's'
elif char == 's':
    output_char = 't'
elif char == 't':
    output_char = 'u'
elif char == 'u':
    output_char = 'v'
elif char == 'v':
    output_char = 'w'
elif char == 'w':
    output_char = 'x'
elif char == 'x':
    output_char = 'y'
elif char == 'y':
    output_char = 'z'

# Printing the output character
print(output_char)
```</s>
