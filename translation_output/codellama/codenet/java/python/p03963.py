<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

class p03963{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K;
        for(int i=2;i<=N;i++){
            ans *= K-1;
        }
        System.out.println(ans);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

N, K = map(int, sys.stdin.readline().split())
ans = K
for i in range(2, N+1):
    ans *= K-1
print(ans)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `range` function is used to iterate from 2 to N+1. The `sys.stdin.readline()` function is used to read a line of input from the user, and the `split()` method is used to split the input into two integers. The `print` function is used to print the final result.</s>
