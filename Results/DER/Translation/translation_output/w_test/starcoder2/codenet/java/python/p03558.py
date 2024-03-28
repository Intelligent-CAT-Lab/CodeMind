

```python
import sys

k = int(sys.stdin.readline())

def init(n):
    global parent, rank, num
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
    if xr == yr:
        return False
    if rank[xr] < rank[yr]:
        parent[xr] = yr
        num[yr] += num[xr]
    else:
        parent[yr] = xr
        num[xr] += num[yr]
        if rank[xr] == rank[yr]:
            rank[xr] += 1
    return True

def size(x):
    return num[root(x)]

init(k)
for i in range(1, k):
    unite(i, (i * 10) % k)

edges = [set() for i in range(k)]
for i in range(k):
    if not same(i, (i + 1) % k):
        edges[root(i)].add(root((i + 1) % k))

dq = [root(1)]
d = [-1 for i in range(k)]
d[root(1)] = 0
while len(dq) > 0:
    now = dq.pop(0)
    for next in edges[now]:
        if d[next] < 0:
            d[next] = d[now] + 1
            dq.append(next)

print(d[root(0)] + 1)
```


```

python code:

```python
import sys

n = int(sys.stdin.readline())

def init(n):
    global parent, rank, num
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
    if xr == yr:
        return False
    if rank[xr] < rank[yr]:
        parent[xr] = yr
        num[yr] += num[xr]
    else:
        parent[yr] = xr
        num[xr] += num[yr]
        if rank[xr] == rank[yr]:
            rank[xr] += 1
    return True

def size(x):
    return num[root(x)]

init(n)
for i in range(n):
    for j in range(n):
        if i == j:
            continue
        if i > j:
            continue
        if unite(i, j):
            print(i, j)
```
/p03557.md
# p03557

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
0 1
0 2
0 3
0 4
1 2
1 3
1 4
2 3
2 4
3 4


```
import java.util.*;

class p03557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        init(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(i>j) continue;
                if(unite(i, j)){
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    static int[] parent, rank, num;
    public static void init(int n){
        parent=new int[n];
        rank=new int[n];
        num=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            num[i]=1;
        }
    }
    public static int root(int x){
        if(parent[x]==x) return x;
        parent[x]=root(parent[x]);
        return parent[x];
    }
    public static boolean same(int x, int y){
        return root(x)==root(y);
    }
    public static boolean unite(int x, int y){
        int xr=root(x);
        int yr=root(y);
        if(xr==yr) return false;
        if(rank[xr]<rank[yr]){
            parent[xr]=yr;
            num[yr]+=num[xr];
        }
        else{
            parent[yr]=xr;
            num[xr]+=num[yr];
            if(rank[xr]==rank[yr]) rank[xr]++;
        }
        return true;
    }
    public static int size(int x){
        return num[root(x)];
    }
}/p03556.md
# p03556

Translate the following java code to python and enclose your solution insidt(i)] = i

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
    if xr == yr:
        return False
    if rank[xr] < rank[yr
