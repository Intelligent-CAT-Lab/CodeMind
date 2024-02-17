import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Combinatrics c = new Combinatrics(k);

    	System.out.println(c.stirling(n,k));

    }
}



class Combinatrics {
	
	static long mod = 1000000007; //逆元を取るので素数前提
	static long[] fact; //階乗のテーブル
	static long[] inv;	//逆元のテーブル
	static long[] finv; //階乗の逆元のテーブル
	
	public Combinatrics(int n){
		int N = Math.max(2,n+1);
		fact = new long[N];
		inv = new long[N];
		finv = new long[N];
	    fact[0] = fact[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for(int i=2;i<n+1; i++){
	        fact[i] = fact[i-1] * i % mod;
	        inv[i] = mod - inv[(int)mod%i] * (mod / i) % mod;
	        finv[i] = finv[i-1] * inv[i] % mod;
	    }
	}
	
	//逆元
	int inv(int n){
		return (int)inv[n];
	}
	
	//n!
	int factorial(int n){
		return (int)fact[n];
	}
	
	//n!の逆元
	int factInv(int n){
		return (int)finv[n];
	}
	
	//nCr（n個からr個選ぶ）
    int combination(int n, int r) {
        if(n<r|| r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[r]%mod*finv[n-r]%mod);
    }

    //nPr (=n*(n-1)*...*(n-r+1))（n個からr個選んで並べる）
    int permutation(int n, int r) {
        if(n<r || r<0){
        	return 0;
        }
        return (int)(fact[n]*finv[n-r]%mod);
    }

    //nHr (=n+r-1Cr)（n個から重複を許してk個とる）
    //（テーブルがn+r-1まで必要な事に注意！）
    int homogeneous(int n, int r) {
        if(n==0 && r==0){
        	return 1;
        }
        return combination(n+r-1,r);
    }
    
    int surjection(int n, int k){
    	long ans = 0;
    	int sign = 1; //符号
    	if(k%2 == 0){
    		sign = -1;
    	}
    	for(int i=1;i<=k;i++){
    		if(sign==1){
    			ans += (long)combination(k,i)*iterationPow(i,n);
    			ans %= mod;
    		}
    		else{
    			ans -= (long)combination(k,i)*iterationPow(i,n);
    			ans %= mod;
    		}
    		sign *= -1;
    	}
    	ans = mod(ans);
    	return (int)ans;
    }
	//x^nをmodのもとで繰り返し2乗法で求める。
	static long iterationPow(long x, long n){
	    long sum = 1;
	    while(n>0){
	        if((n&1)== 1){  //ビットが立っていたら
	            sum *= x;        //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
	            sum %= mod;
	        }
	        x *= x;              //((x^2)^2)^2・・・
	        x %= mod;
	        n >>= 1;
	    }
	    return sum;
	}
	//負の数に対応したmod
	static long mod(long a) {
		return (a % mod + mod) % mod;
	}
	
	//スターリング数（テーブルはkまで必要）
	//n個の区別可能なボールをちょうどk個の区別不可能な箱に入れる組合せの数
	int stirling(int n, int k){
		//全射の個数をk!で割ったものに等しい
		return (int) ((long)surjection(n,k)*(long)factInv(k) % mod);
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
