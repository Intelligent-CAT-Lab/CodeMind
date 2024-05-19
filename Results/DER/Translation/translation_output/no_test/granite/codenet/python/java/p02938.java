System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from functools import *
MOD=10**9+7
@lru_cache(maxsize=None)
def solve(L,R):
  if L > R: return 0
  if L == 1: return (1 + solve(2, R)) % MOD
  return (solve(L//2,(R-1)//2) + solve((L+1)//2,R//2) + solve((L+1)//2,(R-1)//2)) % MOD
  
print(solve(*map(int,input().split())))
```


Answer:
```java
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
    static long MOD=100000007;
    static long solve(long L,long R){
        if(L>R) return 0;
        if(L==1) return (1+solve(2,R))%MOD;
        return (solve(L/2,(R-1)/2)+solve((L+1)/2,R/2)+solve((L+1)/2,(R-1)/2))%MOD;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        StringTokenizer st=new StringTokenizer(br.readLine());
        long L=Long.parseLong(st.nextToken());
        long R=Long.parseLong(st.nextToken());
        out.println(solve(L,R));
        out.close();
    }
}
```<|endoftext|>
