<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


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

python code:<fim_suffix><fim_middle>

```python
import sys

def init(n):
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]
    return parent, rank, num

def root(x, parent):
    if parent[x] == x:
        return x
    else:
        parent[x] = root(parent[x], parent)
        return parent[x]

def same(x, y, parent):
    return root(x, parent) == root(y, parent)

def unite(x, y, parent, rank, num):
    xr = root(x, parent)
    yr = root(y, parent)
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

def size(x, parent):
    return num[root(x, parent)]

def main():
    n = int(sys.stdin.readline())
    parent, rank, num = init(n)
    for i in range(1, n):
        unite(i, (i*10)%n, parent, rank, num)
    edges = [set() for i in range(n)]
    for i in range(n):
        if not same(i, (i+1)%n, parent):
            edges[root(i, parent)].add(root((i+1)%n, parent))
    dq = collections.deque()
    dq.append(root(1, parent))
    d = [-1 for i in range(n)]
    d[root(1, parent)] = 0
    while dq:
        now = dq.popleft()
        for next in edges[now]:
            if d[next] < 0:
                d[next] = d[now] + 1
                dq.append(next)
    print(d[root(0, parent)] + 1)

if __name__ == '__main__':
    main()

```
<|endoftext|>
