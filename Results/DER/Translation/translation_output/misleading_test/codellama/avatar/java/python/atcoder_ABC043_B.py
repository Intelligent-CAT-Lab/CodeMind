<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
78

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
This code uses the `re` module to perform regular expression searches and replacements. The `re.search()` function is used to check if the input string contains the substring "0B" or "1B", and the `re.sub()` function is used to replace all occurrences of "0B" or "1B" with an empty string. The `re.sub()` function is also used to replace all occurrences of " B" with an empty string. Finally, the modified string is printed to the console.</s>
