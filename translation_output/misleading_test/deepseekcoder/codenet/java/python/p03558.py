<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
96

```
import java.util.*;

class p03558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        init(k);
        for(int i=1;i<k;i++){
            unite(i, (i*10)%k);
        }
        HashSet<Integer>[] edges=new HashSet[k];
        for(int i=0;i<k;edges[i++]=new HashSet<>());
        for(int i=0;i<k;i++){
            if(!same(i, (i+1)%k)){
                edges[root(i)].add(root((i+1)%k));
            }
        }
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(root(1));
        int[] d=new int[k];
        for(int i=0;i<k;d[i++]=-1);
        d[root(1)]=0;
        while(dq.size()>0){
            int now=dq.pollFirst();
            for(int next:edges[now]){
                if(d[next]<0){
                    d[next]=d[now]+1;
                    dq.addLast(next);
                }
            }
        }
        System.out.println(d[root(0)]+1);
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
}

```

### Response:
```python
from collections import deque, defaultdict

def main(k):
    init(k)
    for i in range(1, k):
        unite(i, (i*10)%k)
    edges = defaultdict(set)
    for i in range(k):
        if not same(i, (i+1)%k):
            edges[root(i)].add(root((i+1)%k))
    dq = deque([root(1)])
    d = {root(i): -1 for i in range(k)}
    while dq:
        now = dq.popleft()
        for next in edges[now]:
            if d[next] < 0:
                d[next] = d[now] + 1
                dq.append(next)
    print(d[root(0)] + 1)

def init(n):
    global parent, rank, num
    parent = list(range(n))
    rank = [0] * n
    num = [1] * n

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

if __name__ == "__main__":
    k = int(input())
    main(k)
```

This Python code does the same thing as the Java code. It initializes a disjoint set, unites the elements, and then uses a breadth-first search to find the shortest path from the root to all other elements. The result is printed to the console.
<|EOT|>
