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
