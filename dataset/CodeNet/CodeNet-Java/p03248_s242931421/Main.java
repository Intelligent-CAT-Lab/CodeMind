import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        char[] s = sc.next().toCharArray();
        if(s[0] == '0' || s[s.length-1] == '1'){
            System.out.println(-1);
            return;
        }
        ArrayList<Edge> li = new ArrayList<>();
        int root = 1;
        boolean is1 = true;
        for(int i = 0; i < s.length-1; i++){
            if(s[i] != s[s.length-2-i]){
                System.out.println(-1);
                return;
            }
            if(i != 0){
                li.add(new Edge(root, i+1));
            }
            if(s[i] == '1'){
                root = i+1;
            }else{
                is1 = false;
            }
        }
        for(Edge e : li){
            System.out.println(e.s + " " + e.g);
        }
        System.out.println(!is1 ? "1 "+s.length : root + " " + s.length);
    }
}

class Edge{
    int s,g;
    public Edge(int s, int g){
        this.s = s;
        this.g = g;
    }
}

class WeightedUnionFind{
    int[] parent;
    int[] rank;
    long[] weight;
    int[] size;
 
    public WeightedUnionFind(int size) {
		this.parent = new int[size];
		this.rank = new int[size];
        this.weight = new long[size];
		this.size = new int[size];
		
		for (int i = 0; i < size; i++) {
			makeSet(i);
		}
	}
	
	public void makeSet(int i) {
		parent[i] = i;
		rank[i] = 0;
		size[i] = 1;
	}
 
    public boolean union(int x, int y, long w) {
        w += getWeight(x);
        w -= getWeight(y);
        int xRoot = find(x);
        int yRoot = find(y);
        if(xRoot == yRoot){
            return getDistance(xRoot,yRoot) == w;
        } else if (rank[xRoot] > rank[yRoot]) { 
            parent[yRoot] = xRoot;
            size[xRoot] += size[yRoot];
            weight[yRoot] = w;
        } else if(rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
            size[yRoot] += size[xRoot];
            weight[xRoot] = -w;
        } else if (xRoot != yRoot){
            parent[yRoot] = xRoot;
            size[xRoot] += size[yRoot];
            rank[xRoot]++; 
            weight[yRoot] = w;
        }
        return true;
    }
	
	public int find(int i) {
	    int p = parent[i];
	    if (i != parent[i]) {
	        parent[i] = find(parent[i]);
	        weight[i] += weight[p];
	    }
	    return parent[i];
	}
    
    public long getWeight(int i){
        find(i);
        return weight[i];
    }
    
    public long getDistance(int x, int y) {
        return getWeight(y) - getWeight(x);
    }
	
	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
 
	public int size(int x) {
	    return size[find(x)];
	}
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
