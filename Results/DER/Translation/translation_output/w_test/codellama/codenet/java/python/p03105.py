<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
4


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
```
import sys

A, B, C = map(int, sys.stdin.readline().split())
N = int(B / A)
if N > C:
    print(C)
else:
    print(N)
```
Note: The `map` function is used to convert the input strings to integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `readline` method is used to read a line of input from the standard input stream. The `stdin` attribute is used to access the standard input stream.</s>
