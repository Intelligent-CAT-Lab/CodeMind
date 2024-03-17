<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4 5

Expected output:
6


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
```
import sys

x, y, z = map(int, sys.stdin.readline().split())
print((x*y)/2)
```
This code uses the `map` function to convert the input from strings to integers, and then uses the `/` operator to divide the product of `x` and `y` by 2. The result is then printed to the console using the `print` function.

Note that the `sys.stdin.readline()` method is used to read a line of input from the console, and the `split()` method is used to split the line into a list of strings. The `map` function is then used to convert each string in the list to an integer.</s>
