<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b, c = sys.stdin.readline().split(',')
print(a, b, c)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split(',')` splits the line into a list of strings using the comma as the delimiter.
* `print(a, b, c)` prints the three strings separated by spaces.

Note: The `sys` module is used to access the standard input and output streams. The `readline()` method is used to read a line from the standard input, and the `split()` method is used to split the line into a list of strings. The `print()` function is used to print the three strings separated by spaces.</s>
