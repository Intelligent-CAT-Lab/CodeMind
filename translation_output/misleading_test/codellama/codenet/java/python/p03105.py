<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
-26

```
import java.util.*;

public class p03105 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A= entrada.nextInt();
        int B= entrada.nextInt();
        int C= entrada.nextInt();
        int N=(int)B/A;
        if (N>C){
            System.out.println(C);
        }
        else{
            System.out.println(N);
        }
    }
    
}

```
[/INST]
```python
import sys

A, B, C = map(int, sys.stdin.readline().split())
N = int(B / A)

if N > C:
    print(C)
else:
    print(N)
```
Note: The `map` function is used to convert the input strings to integers. The `int` function is used to convert the result of the division to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` method is used to split the input string into a list of strings, where each string represents a number. The `map` function is used to apply the `int` function to each string in the list, which converts the strings to integers.</s>
