<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import sys

line = sys.stdin.readline()
line1 = line.split(" ")
a = int(line1[0])
b = int(line1[1])
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
```
Note: The `sys` module is used to read input from the standard input stream, and the `readline()` method is used to read a line of input. The `split()` method is used to split the line into a list of strings, and the `int()` function is used to convert the strings to integers. The `if` statement is used to check if the condition `a > 2 * b` is true, and the `print()` function is used to print the result.</s>
