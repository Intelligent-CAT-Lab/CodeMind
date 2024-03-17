<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```
[/INST]
```
import re

pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
s = input()
if re.match(pat, s):
    print("YES")
else:
    print("NO")
```
Note: The `re` module in Python is used for regular expression matching. The `input()` function is used to read a string from the user. The `match()` function is used to check if the input string matches the given pattern.</s>
