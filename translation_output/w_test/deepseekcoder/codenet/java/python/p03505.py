<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
5


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03505 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong(), A=sc.nextLong(), B=sc.nextLong();
        long ans = help(K,A,B);
        System.out.println(ans);
    }
    static long help(long K, long A, long B){
        if(A<=B) return A>=K?1:-1;
        if(A>=K) return 1;
        long dif = (A-B);
        long t = (K-A)/dif+((K-A)%dif==0?0:1);
        return 2*t+1;
    }
}

```

### Response:
```python
import sys

def help(K, A, B):
    if A <= B: 
        return 1 if A >= K else -1
    if A >= K: 
        return 1
    dif = A - B
    t = (K - A) // dif + ((K - A) % dif == 0)
    return 2 * t + 1

K, A, B = map(int, sys.stdin.readline().split())
print(help(K, A, B))
```

This Python code reads three integers from the standard input, and passes them to the `help` function. The function calculates and returns the result, which is then printed to the standard output. The `help` function is a direct translation of the `help` method in the provided Java code.
<|EOT|>
