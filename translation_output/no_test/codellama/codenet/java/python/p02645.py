<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

s = sys.stdin.readline().strip()
print(s[0:3])
```
In this code, we use the `sys` module to read the input from the standard input stream. We then use the `strip()` method to remove any leading or trailing whitespace from the input string. Finally, we use slicing to extract the first three characters of the string and print them to the console.</s>
