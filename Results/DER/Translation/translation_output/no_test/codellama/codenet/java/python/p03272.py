<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03272 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        System.out.println(N-K+1);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

N, K = map(int, sys.stdin.readline().split())
print(N - K + 1)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `print()` prints the result to the standard output.</s>
