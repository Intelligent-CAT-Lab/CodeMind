<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```
[/INST]
```
import sys

X, Y = map(int, sys.stdin.readline().split())

i = 0
while X <= Y:
    i += 1
    X *= 2

print(i)
```
This code reads two integers X and Y from standard input using the `map` function to convert them to integers, and then uses a while loop to increment `i` while `X` is less than or equal to `Y`. The loop multiplies `X` by 2 each iteration, and the final value of `i` is printed to standard output.</s>
