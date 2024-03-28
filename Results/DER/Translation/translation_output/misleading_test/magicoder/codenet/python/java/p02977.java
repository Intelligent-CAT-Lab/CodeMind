<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
Yes
1 2
2 3
3 4
4 5
5 6
P

```

import sys
#sys.stdin=open("data.txt")
input=sys.stdin.readline
mii=lambda:map(int,input().split())

# n=4k+3 <=> the line graph works
# these fail: 1 2 4 8 16 32 ...

# 1 2 3 1 2 3
# 4 5 1 4 5
# 6 7 1 6 7

# so n=2k+1 (except n=1) works

def get(n):
    e=[]
    p=1
    while p*2<=n:
        p*=2
    if n!=p:
        # make line graph
        m=n
        while m%4!=3: m-=1
        for i in range(1,m):
            e.append([i,i+1])
            e.append([n+i,n+i+1])
        e.append([m,n+1])
        if n%4==1 or n%4==2:
            m=n
            if n%4==2: m-=1
            e.append([m-1,m])
            e.append([m,n+1])
            e.append([n+1,n+m-1])
            e.append([n+m-1,n+m])
        if n%4==0 or n%4==2:    # not a power of 2
            t=n-1
            e.append([n,t])
            for i in range(1,n+1):
                t^=i
                if t==n:
                    e.append([n+i,n+n])
                    break
    return e

n=int(input())
e=get(n)
if e:
    print("Yes")
    for i,j in e:
        print("%d %d"%(i,j))
else:
    print("No")

"""
def dfs(u):
    vis[u]=1
    root[u]^=(u-1)%n+1
    for v in g[u]:
        if vis[v]: continue
        root[v]=root[u]
        dfs(v)

for n in range(1,50):
    g=[[] for _ in range(2*n+1)]
    e=get(n)
    if not e: continue
    assert len(e)==n*2-1
    for i,j in e:
        g[i].append(j)
        g[j].append(i)
    for i in range(1,n+1):
        vis=[0]*(2*n+1)
        root=[0]*(2*n+1)
        dfs(i)
        assert root[n+i]==i
"""

```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> e = get(n);
        if (e.size() > 0) {
            System.out.println("Yes");
            for (List<Integer> edge : e) {
                System.out.println(edge.get(0) + " " + edge.get(1));
            }
        } else {
            System.out.println("No");
        }
    }

    public static List<List<Integer>> get(int n) {
        List<List<Integer>> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            int m = n;
            while (m % 4 != 3) {
                m--;
            }
            for (int i = 1; i < m; i++) {
                List<Integer> edge = new ArrayList<>();
                edge.add(i);
                edge.add(i + 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + i);
                edge.add(n + i + 1);
                e.add(edge);
            }
            List<Integer> edge = new ArrayList<>();
            edge.add(m);
            edge.add(n + 1);
            e.add(edge);
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                edge = new ArrayList<>();
                edge.add(m - 1);
                edge.add(m);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(m);
                edge.add(n + 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + 1);
                edge.add(n + m - 1);
                e.add(edge);
                edge = new ArrayList<>();
                edge.add(n + m - 1);
                edge.add(n + m);
                e.add(edge);
            }
            if (n % 4 == 0 || n % 4 == 2) {
                int t = n - 1;
                edge = new ArrayList<>();
                edge.add(n);
                edge.add(t);
                e.add(edge);
                for (int i = 1; i < n + 1; i++) {
                    t ^= i;
                    if (t == n) {
                        edge = new ArrayList<>();
                        edge.add(n + i);
                        edge.add(n + n);
                        e.add(edge);
                        break;
                    }
                }
            }
        }
        return e;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calls the `get` function, and prints the result. The `get` function generates a list of edges for a graph, which is then printed. If the list is empty, "No" is printed instead.<｜end▁of▁sentence｜>
