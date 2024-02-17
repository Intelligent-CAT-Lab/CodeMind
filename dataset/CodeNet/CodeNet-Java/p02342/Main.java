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

    	System.out.println(partition(n-k,k));

    }
    
	//分割数をdpで求める
	//nをk個の非負整数の和で表す（⇔k個以下の自然数の和で表す）場合の数
	static int partition(int n, int k){
		if(n<0){return 0;} //こうしておくことで、partition(n-k,k)でnを丁度k個の自然数で表す組合せの数を計算できる
		if(n==0){return 1;}
		int mod = 1000000007;
		if(k>n){k=n;} //無駄な計算を省ける。テーブルごと使う場合は注意。
		int[][] dp = new int[n+1][k+1];
		dp[0][0] = 1;
		for(int i=0;i<=n;i++){
			dp[i][1] = 1; 
		}
		for(int i=2;i<=k;i++){
			dp[0][i] = 1;
			dp[1][i] = 1; 
		}
		
		for(int i=1;i<=n;i++){
			for(int j=2;j<=k;j++){
				if(i-j>=0){
					dp[i][j] = dp[i][j-1] + dp[i-j][j]; //0を最低1つ含む + 丁度k個の自然数の和
					dp[i][j] %= mod;
				}
				else{
					dp[i][j] = dp[i][j-1];
				}
			}
		}
		
		return dp[n][k];
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
