Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

import sys
#sys.stdin=open("data.txt")
input=sys.stdin.readline
mii=lambda:map(int,input().split())

# n=4k+3 <=> the line graph works
# these fail: 1 2 4 8 16 32...

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

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<int[]> e = get(n);

        if (e == null) {
            bw.write("No");
            bw.newLine();
        } else {
            bw.write("Yes");
            bw.newLine();
            for (int[] edge : e) {
                bw.write(edge[0] + " " + edge[1]);
                bw.newLine();
            }
        }

        bw.close();
    }

    public static List<int[]> get(int n) {
        List<int[]> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n!= p) {
            // make line graph
            int m = n;
            while (m % 4!= 3) {
                m--;
            }
            for (int i = 1; i < m; i++) {
                e.add(new int[]{i, i + 1});
                e.add(new int[]{n + i, n + i + 1});
            }
            e.add(new int[]{m, n + 1});
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) {
                    m--;
                }
                e.add(new int[]{m - 1, m});
                e.add(new int[]{m, n + 1});
                e.add(new int[]{n + 1, n + m - 1});
                e.add(new int[]{n + m - 1, n + m});
            }
            if (n % 4 == 0 || n % 4 == 2) { // not a power of 2
                int t = n - 1;
                e.add(new int[]{n, t});
                for (int i = 1; i <= n; i++) {
                    t ^= i;
                    if (t == n) {
                        e.add(new int[]{n + i, n + n});
                        break;
                    }
                }
            }
        }
        return e;
    }
}
```<|endoftext|>
