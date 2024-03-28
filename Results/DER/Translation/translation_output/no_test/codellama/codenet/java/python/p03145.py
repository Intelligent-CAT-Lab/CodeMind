<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class p03145 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        System.out.println((x*y)/2);
        
    }
    
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

x, y, z = map(int, sys.stdin.readline().split())

print((x * y) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings, where each string is a number.
* `map(int, ...)` applies the `int()` function to each string in the list, which converts it to an integer.
* `x, y, z = ...` assigns the three integers to the variables `x`, `y`, and `z`.
* `print((x * y) // 2)` prints the result of the calculation `(x * y) // 2`. The `//` operator performs integer division and returns the integer part of the result.</s>
