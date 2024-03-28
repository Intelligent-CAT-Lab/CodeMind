<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
46

```
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
```
[/INST]
```python
import sys

x, y, z = map(int, sys.stdin.readline().split())
print((x * y) // 2)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings, where each string is a number.
* `map(int, ...)` applies the `int()` function to each element of the list, which converts each string to an integer.
* `x * y` calculates the product of `x` and `y`.
* `// 2` calculates the integer division of the product by 2.
* `print()` prints the result to the standard output.</s>
