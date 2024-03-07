<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02765 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

n, r = map(int, sys.stdin.readline().split())

if n < 10:
    print(r + (10 - n) * 100)
else:
    print(r)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of substrings, using spaces as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, converting it to an integer.
* `n, r = ...` unpacks the list into two variables, `n` and `r`.
* The rest of the code is the same as the Java code.</s>
