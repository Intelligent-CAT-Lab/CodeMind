<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
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

def main():
    K, A, B = map(int, sys.stdin.readline().split())
    ans = help(K, A, B)
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calls the `help` function with these integers, and then prints the result. The `help` function calculates the answer according to the same logic as in the Java code.<｜end▁of▁sentence｜>
