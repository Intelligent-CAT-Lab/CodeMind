<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class p03558:
    def __init__(self, k):
        self.parent = [i for i in range(k)]
        self.rank = [0 for _ in range(k)]
        self.num = [1 for _ in range(k)]

    def root(self, x):
        if self.parent[x] == x:
            return x
        self.parent[x] = self.root(self.parent[x])
        return self.parent[x]

    def same(self, x, y):
        return self.root(x) == self.root(y)

    def unite(self, x, y):
        xr = self.root(x)
        yr = self.root(y)
        if xr == yr:
            return False
        if self.rank[xr] < self.rank[yr]:
            self.parent[xr] = yr
            self.num[yr] += self.num[xr]
        else:
            self.parent[yr] = xr
            self.num[xr] += self.num[yr]
            if self.rank[xr] == self.rank[yr]:
                self.rank[xr] += 1
        return True

    def size(self, x):
        return self.num[self.root(x)]

if __name__ == "__main__":
    k = int(sys.stdin.readline())
    p03558 = p03558(k)
    for i in range(1, k):
        p03558.unite(i, (i * 10) % k)
    edges = [set() for _ in range(k)]
    for i in range(k):
        if not p03558.same(i, (i + 1) % k):
            edges[p03558.root(i)].add(p03558.root((i + 1) % k))
    dq = collections.deque([p03558.root(1)])
    d = [-1 for _ in range(k)]
    d[p03558.root(1)] = 0
    while dq:
        now = dq.popleft()
        for next in edges[now]:
            if d[next] < 0:
                d[next] = d[now] + 1
                dq.append(next)
    print(d[p03558.root(0)] + 1)
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should produce the correct output for the given input.</s>
