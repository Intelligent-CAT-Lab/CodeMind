<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        System.out.println(b % a == 0 ? a + b : b - a);
    }
    
    // // ãã©ã¡ã¿æ¸¡ããã¡ããã¨ã¯ã©ã¹ä½ãã®ãé¢åãªã®ã§ææã
    // // å¿è¦ãªå¤ã¯ããã§å¨é¨åã£ã¦ãã¾ã
    // Scanner sc = new Scanner(System.in);
    // int n = Integer.parseInt(sc.next());
    // {sc.nextLine();}
    // int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    
    // String solve() {
    //     return n + "" + Arrays.toString(a);
    // }
    
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if b % a == 0:
    print(a + b)
else:
    print(b - a)
```
This code reads two integers `a` and `b` from the standard input using the `sys.stdin.readline()` method, and then uses the `map()` function to convert the input strings to integers.

The `if` statement checks if `b` is divisible by `a`, and if it is, it prints `a + b`, otherwise it prints `b - a`.

Note that the `sys.stdin.readline()` method reads a single line from the standard input, and the `split()` method splits the line into a list of strings using the space character as the delimiter. The `map()` function applies the `int()` function to each element of the list, which converts the strings to integers.</s>
