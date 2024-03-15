<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    K = int(input())
    A = int(input())
    B = int(input())
    ans = help(K,A,B)
    print(ans)

def help(K,A,B):
    if(A<=B):
        return 1 if A>=K else -1
    if(A>=K):
        return 1
    dif = A-B
    t = (K-A)//dif + (K-A)%dif==0
    return 2*t+1

if __name__ == "__main__":
    main()
```</s>
