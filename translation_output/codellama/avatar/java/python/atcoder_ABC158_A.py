<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```
import sys

str = sys.stdin.readline().strip()

if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `strip()` is used to remove any leading or trailing whitespace from the string.
* The `if` statement checks if the string is equal to "AAA" or "BBB", and if it is, it prints "No". Otherwise, it prints "Yes".

Note: The `strip()` method is used to remove any leading or trailing whitespace from the string, which is not necessary in this case since the input is a single word. However, it is a good practice to use `strip()` when reading input from the user to avoid any unexpected whitespace issues.</s>
