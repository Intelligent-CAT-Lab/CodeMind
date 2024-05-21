import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class p02337 implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new p02337(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Combinatrics c = new Combinatrics(k);

    	System.out.println(c.bell(n,k));

    }
}



class Combinatrics {
	
	static long mod = 1000000007; #éåãåãã®ã§ç´ æ°åæ
	static long[] fact; #éä¹ã®ãã¼ãã«
	static long[] inv;	#éåã®ãã¼ãã«
	static long[] finv; #éä¹ã®éåã®ãã¼ãã«
	
	public Combinatrics(int n){
		int N = max(2,n+1);
		fact = [0]*N;
		inv = [0]*N;
		finv = [0]*N;
	    fact[0] = fact[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for i in range(2,n+1):
	        fact[i] = fact[i-1] * i % mod;
	        inv[i] = mod - inv[(int)(mod%i)] * (mod / i) % mod;
	        finv[i] = finv[i-1] * inv[i] % mod;
	
	#éå
	def inv(self, n):
		return (int)inv[n]
	
	#n!
	def factorial(self, n):
		return (int)fact[n]
	
	#n!ã®éå
	def factInv(self, n):
		return (int)finv[n]
	
	#nCrï¼nåããråé¸ã¶ï¼
    def combination(self, n, r) {
        if(n<r or r<0):
        	return 0;
        return (int)(fact[n]*finv[r]%mod*finv[n-r]%mod);
    }

    #nPr (=n*(n-1)*...*(n-r+1))ï¼nåããråé¸ãã§ä¸¦ã¹ãï¼
    def permutation(self, n, r) {
        if(n<r or r<0):
        	return 0;
        return (int)(fact[n]*finv[n-r]%mod);
    }

    #nHr (=n+r-1Cr)ï¼nåããéè¤ãè¨±ãã¦kåã¨ãï¼
    #ï¼ãã¼ãã«ãn+r-1ã¾ã§å¿è¦ãªäºã«æ³¨æï¼ï¼
    def homogeneous(self, n, k) {
        if(n==0 and r==0):
        	return 1;
        return self.combination(n+r-1,r);
    
    def surjection(self, n, k):
    	ans = 0;
    	sign = 1; #ç¬¦å·
    	if(k%2 == 0):
    		sign = -1;
    	for i in range(1,k+1):
    		if(sign==1):
    			ans += (long)self.combination(k,i)*self.iterationPow(i,n);
    			ans %= mod;
    		else:
    			ans -= (long)self.combination(k,i)*self.iterationPow(i,n);
    			ans %= mod;
    		sign *= -1;
    	ans = self.mod(ans);
    	return (int)ans;
    	
    #x^nãmodã®ãã¨ã©ç¹°ãè¿ã2ä¹æ³ã¨æ±ããã
    def iterationPow(self, x, n):
        sum = 1;
        while(n>0):
            if((n&1)== 1):  #ããããç«ã£ã¦ããã
                sum *= x;        #x^2^k1 * x^2^k2 * x^2^k3 * ã»ã»ã»
                sum %= mod;
            x *= x;              #((x^2)^2)^2ã»ã»ã»
            x %= mod;
            n >>= 1;
        return sum;
    
    #è² ã®æ°ã«å¯¾å¿ããmod
    def mod(self, a) {
        return (a % mod + mod) % mod;
    }
    
    #ã¹ã¿ã¼ãªã³ã°æ°ï¼ãã¼ãã«ã¯kã¾ãå¿è¦ï¼
    #nåã®åºå¥å¯è½ãªãã¼ã«ãã¡ããã©kåã®åºå¥ä¸å¯è½ãªç®±ã«å¥ããçµåããã
    def stirling(self, n, k) {
        #å¨å°ã®åæ°ï¼ãã¼ãã«ãkã¾ãåããæ°
        return (int) ((long)self.surjection(n,k)*(long)self.factInv(k) % mod;
    }
    
    #ãã«æ°ï¼ãã¼ãã«ãkã¾ãåããæ°