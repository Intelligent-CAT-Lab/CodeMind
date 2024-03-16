<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

line = sys.stdin.readline()
length = len(line)
print(line[:length-8])
```
In this code, we use the `sys` module to read a line from the standard input. We then use the `len` function to get the length of the line, and the `print` function to print the substring of the line from the beginning to the end minus 8 characters.

Note that in Python, we use square brackets `[]` to access the elements of a string, rather than the parentheses `()` used in Java. Additionally, we use the `:` operator to specify the start and end indices of the substring, rather than the `substring` method used in Java.</s>
