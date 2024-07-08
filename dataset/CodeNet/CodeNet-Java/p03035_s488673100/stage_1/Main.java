import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 998244353;
	//static final long MOD = 1000000007;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A >= 13) {
        	System.out.println(B);
        } else if  (A > 5) {
        	System.out.println(B/2);
        } else {
        	System.out.println(0);
        }
        
    }
    
    public static int[] baseN(int N, int num) {
    	int[] ans = new int[N];
    	for (int i = N-1; i >= 0; i--) {
var newVariable_0 = Math.pow(N,i);    		int pow = (int)newVariable_0;
    		ans[i] = num/pow;
    		num -= ans[i]*pow;
    	}
    	return ans;
    }
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i< array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
			  public int compare(int[] arr1, int[] arr2) {
				  //Descending order
				  return arr2[0]-arr1[0];
			  }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
var newVariable_1 = st.hasMoreElements();            while (st == null || !newVariable_1) { 
                try { 
var newVariable_2 = br.readLine();                    st = new StringTokenizer(newVariable_2);
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
var newVariable_3 = st.nextToken();            return newVariable_3; 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str; 
        }
    }
}

class Node {
	public HashSet<Node> children;
	public int n;
	
	public Node(int n) {
		this.n = n;
		children = new HashSet<Node>();
	}
	
	public void addChild(Node node) {
var newVariable_4 = children.add(node);	}
	
	public void removeChild(Node node) {
var newVariable_5 = children.remove(node);	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return n;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Node)) {
			return false;
		} else {
			Node node = (Node) obj;
			return (n == node.n);
		}
	}
	
	public String toString() {
		return (this.n+1)+"";
	}
}

class DisjointSets {
	  public int N;
	  public int[] parent;
	  public int[] rank;
	  public int count;

	  public DisjointSets(int numNodes) {
	    N = numNodes;
	    parent = new int[N];
	    rank = new int[N];
	    for (int i = 0; i < N; i++) {
	      parent[i] = i;
	      rank[i] = 1;
	    }
	    count = numNodes;
	  }

	  public boolean isConnected(int p, int q) {
	    return root(p) == root(q);
	  }

	  public int root(int p) {
	    while (p != parent[p])
	      p = parent[p];
	    return p;
	  }

	  //only connect p and q if they are disjointed.
	  public void connect(int p, int q) {
	    int rootP = root(p);
	    int rootQ = root(q);
	    if (rank[rootP] >= rank[rootQ]) {
	      parent[rootQ] = rootP;
	      rank[rootP] += rank[rootQ];
	    } else if (rank[rootQ] > rank[rootP]) {
	      parent[rootP] = rootQ;
	      rank[rootQ] += rank[rootP];
	    }
	    count--;
	  }
}