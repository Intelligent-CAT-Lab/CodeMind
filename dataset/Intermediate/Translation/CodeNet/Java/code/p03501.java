import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class p03501 {
	static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int A = sc.ni();
		int B = sc.ni();
		pw.println(Math.min(A*N,B));
		pw.close();
	}
	
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		if (y < 0) return 0L;
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] a, int[] b) {
				  //return a[0]-b[0]; //ascending order
				  if (a[0] != b[0]) {
					  return (a[0]-b[0]);
				  } else {
					  return (a[1]-b[1]);
				  }
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else if (a[0] > b[0])
					  return 1;
				  else
					  return 0;
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
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int ni() { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
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