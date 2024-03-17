<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```
[/INST]
```
import re

def main():
    s = input()
    
    while re.search(r'0B|1B', s):
        s = re.sub(r'0B|1B', '', s)
    
    s = re.sub(r' B', '', s)
    
    print(s)

if __name__ == '__main__':
    main()
```
This is a Python implementation of the Java code provided. It uses the `re` module for regular expression matching and replacement. The `input()` function is used to read a string from the user, and the `print()` function is used to print the resulting string. The `if __name__ == '__main__':` block is used to indicate that the `main()` function should be executed when the script is run directly, rather than when it is imported as a module.</s>
