<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class p02335 implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new p02335(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Combinatrics c = new Combinatrics(k);

    	System.out.println(c.combination(k, n));
    }
}



class Combinatrics {
	
	static long mod = 1000000007; //éåãåãã®ã§ç´ æ°åæ
	static long[] fact; //éä¹ã®ãã¼ãã«
	static long[] inv;	//éåã®ãã¼ãã«
	static long[] finv; //éä¹ã®éåã®ãã¼ãã«
	
	public Combinatrics(int n){
		fact = new long[n+1];
		inv = new long[n+1];
		finv = new long[n+1];
	    fact[0] = fact[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for(int i=2;i<n+1; i++){
	        fact[i] = fact[i-1] * i % mod;
	        inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
	        finv[i] = finv[i-1] * inv[i] % mod;
	    }
	}
	
	//éå
	int inv(int n){
		return (int)inv[n];
	}
	
	//n!
	int factorial(int n){
		return (int)fact[n];
	}
	
	//n!ã®éå
	int factInv(int n){
		return (int)finv[n];
	}
	
	//nCrï¼nåããråé¸ã¶ï¼
    int combination(int n, int r) {
        if(n<r|| r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[r]%mod*finv[n-r]%mod);
    }

    //nPr (=n*(n-1)*...*(n-r+1))ï¼nåããråé¸ãã§ä¸¦ã¹ãï¼
    int permutation(int n, int r) {
        if(n<r || r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[n-r]%mod);
    }

    //nHr (=n+r-1Cr)ï¼nåããéè¤ãè¨±ãã¦kåã¨ãï¼
    //ï¼ãã¼ãã«ãn+r-1ã¾ã§å¿è¦ãªäºã«æ³¨æï¼ï¼
    int homogeneous(int n, int r) {
        if(n==0 && r==0){
        	return 1;
        }
        return combination(n+r-1,r);
    }

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

```
</s>
