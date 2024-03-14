Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
#!usr/bin/env python3
from collections import defaultdict,deque
from heapq import heappush, heappop
import sys
import math
import bisect
import random
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def I(): return int(sys.stdin.readline())
def LS():return [list(x) for x in sys.stdin.readline().split()]
def S(): return list(sys.stdin.readline())[:-1]
def IR(n):
    return [I() for i in range(n)]
def LIR(n):
    return [LI() for i in range(n)]
def SR(n):
    return [S() for i in range(n)]
def LSR(n):
    return [LS() for i in range(n)]

sys.setrecursionlimit(1000000)
mod = 1000000007

def solve():
    def sum(a,b):
        return ((b+a)*(b-a+1)) >> 1
    def fact(n):
        if n < 4:
            return [1,n]
        res = [1]
        i = 2
        while i**2 <= n:
            if n%i == 0:
                res.append(i)
                m = n//i
                if i!= m:
                    res.append(m)
            i += 1
        res.append(n)
        return res
    s = I()
    if s == 1:
        print(1)
        return
    lis = fact(s)
    f = defaultdict(lambda : 0)
    p = defaultdict(lambda : 1)
    lis.sort()
    for k in lis:
        for a in range(1,k+1):
            b = k-a
            if a <= b:
                if p[(a,b)]:
                    f[sum(a,b)] += 1
                    p[(a,b)] = 0
                    
        for a in range(1,s+1):
            b = k+a-1
            if p[(a,b)]:
                s_ = sum(a,b)
                if s_ > s:
                    break
                f[s_] += 1
                p[(a,b)] = 0
    ans = 0
    for k in lis:
        ans += f[k]*f[s//k]
    print(ans)
    return

#Solve
if __name__ == "__main__":
    solve()


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s == 1){
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Pair, Integer> p = new HashMap<>();
        for(int k : lis){
            for(int a = 1; a <= k; a++){
                int b = k-a;
                if(a <= b){
                    if(!p.containsKey(new Pair(a,b))){
                        f.put(sum(a,b), f.getOrDefault(sum(a,b), 0) + 1);
                        p.put(new Pair(a,b), 0);
                    }
                }
            }
            for(int a = 1; a <= s; a++){
                int b = k+a-1;
                if(a <= b){
                    int s_ = sum(a,b);
                    if(s_ > s) break;
                    if(!p.containsKey(new Pair(a,b))){
                        f.put(s_, f.getOrDefault(s_, 0) + 1);
                        p.put(new Pair(a,b), 0);
                    }
                }
            }
        }
        int ans = 0;
        for(int k : lis){
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s/k, 0);
        }
        System.out.println(ans);
    }
    static List<Integer> fact(int n){
        List<Integer> res = new ArrayList<>();
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                res.add(i);
                while(n%i == 0) n /= i;
            }
        }
        if(n > 1) res.add(n);
        return res;
    }
    static int sum(int a, int b){
        return (b+a)*(b-a+1)/2;
    }
    static class Pair{
        int a, b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Pair){
                Pair p = (Pair)obj;
                return p.a == a && p.b == b;
            }
            return false;
        }
        @Override
        public int hashCode(){
            return Objects.hash(a, b);
        }
    }
}
```<|endoftext|>
