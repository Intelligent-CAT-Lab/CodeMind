<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
YES


```
import java.util.Scanner;
public class p03377{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         int b=s.nextInt();
         int x=s.nextInt();
         if(a+b>=x&&a<=x){
             System.out.println("YES");
         }
        
         else
         System.out.println("NO");
        
     }
}
```
[/INST]
```
import sys

a, b, x = map(int, sys.stdin.readline().split())

if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `a, b, x = ...` unpacks the list into separate variables `a`, `b`, and `x`.
* The rest of the code is the same as the Java code, with the exception of the `print()` function, which is used in Python instead of `System.out.println()`.</s>
