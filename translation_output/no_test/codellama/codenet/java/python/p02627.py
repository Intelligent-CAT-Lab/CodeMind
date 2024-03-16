<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import re

def main():
    str = input("Enter a string: ")
    if re.match("[A-Z]", str):
        print("A")
    else:
        print("a")

if __name__ == "__main__":
    main()
```
This code uses the `re` module to perform a regular expression match on the input string. The regular expression `[A-Z]` matches any uppercase letter, and the `re.match()` function returns `True` if the input string matches this pattern. If the input string does not match the pattern, the `else` clause is executed and the string "a" is printed.</s>
