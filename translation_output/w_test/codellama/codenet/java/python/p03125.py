<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 12

Expected output:
16


```
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

```
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using the space character as the delimiter.
* `map(int, ...)` converts each string in the list to an integer.
* `a, b = ...` unpacks the two integers into variables `a` and `b`.
* `print(b % a == 0 and a + b or b - a)` prints the result of the expression `b % a == 0 and a + b or b - a`.

Note: The `and` and `or` operators have a lower precedence than the `==` operator, so the expression is evaluated as `b % a == 0 and (a + b) or (b - a)`. This is equivalent to `b % a == 0 and a + b else b - a`.</s>
