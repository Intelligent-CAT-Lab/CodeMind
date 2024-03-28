<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    K, A, B = map(int, sys.stdin.readline().split())
    print(help(K, A, B))

def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + ((K - A) % dif == 0)
    return 2 * t + 1

if __name__ == "__main__":
    main()
```</s>
