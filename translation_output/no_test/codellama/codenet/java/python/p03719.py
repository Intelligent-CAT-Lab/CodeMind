<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03719 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String result = "No";
        if (a <= c && c <= b) result ="Yes";
        
        System.out.println(result);
      
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

if a <= c <= b:
    print("Yes")
else:
    print("No")
```
This code first reads the input from the user using the `sys.stdin.readline()` method, which reads a line of input from the standard input stream. The input is then split into three integers using the `split()` method, and the resulting list is unpacked into the variables `a`, `b`, and `c` using the `map()` function.

The next step is to check if the condition `a <= c <= b` is true. If it is, the string "Yes" is printed to the console using the `print()` function. Otherwise, the string "No" is printed.

Note that the `map()` function is used to convert the input from a string to an integer. The `split()` method is used to split the input into a list of strings, and the `map()` function is used to convert each string in the list to an integer.</s>
