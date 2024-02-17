
import java.util.Arrays;
import java.util.Random;

public class Main {
  private static void solve() {
    long n = nl();
    int[] primes = sieveAtkin(2000000);
    long[] d = enumDivisors(n, primes);
    long[][] f = factorX(n, primes);
    
    System.out.println(f.length + " " + (d.length - 1));
  }
  
  
  static long[][] factorX(long n, int[] primes)
  {
      long[][] ret = new long[20][2];
      int rp = 0;
      for(int p : primes){
          if((long)p * p > n)break;
          int i;
          for(i = 0;n % p == 0;n /= p, i++);
          if(i > 0){
              ret[rp][0] = p;
              ret[rp][1] = i;
              rp++;
          }
      }
      if(n == 1)return Arrays.copyOf(ret, rp);
      
      // P^2
      long sq = (long)Math.sqrt(n);
      for(long u = Math.max(2, sq-2);u <= sq+2;u++){
          if(u*u == n){
              ret[rp][0] = u;
              ret[rp][1] = 2;
              rp++;
              return Arrays.copyOf(ret, rp);
          }
      }
      
      // Prime
      if(doMirrorRabin(n)){
          ret[rp][0] = n;
          ret[rp][1] = 1;
          rp++;
          return Arrays.copyOf(ret, rp);
      }
      
      // P*Q
      long f = rho(n);
      if(f == -1)throw new ArithmeticException();
      if(f > n/f)f = n/f;
      ret[rp][0] = f; ret[rp][1] = 1; rp++;
      ret[rp][0] = n/f; ret[rp][1] = 1; rp++;
      return Arrays.copyOf(ret, rp);
  }
  
  public static long mul(long a, long b, long mod)
  {
      a %= mod;
      long ret = 0;
      int x = 63-Long.numberOfLeadingZeros(b);
      for(;x >= 0;x--){
          ret += ret;
          if(ret >= mod)ret -= mod;
          if(b<<~x<0){
              ret += a;
              if(ret >= mod)ret -= mod;
          }
      }
      return ret;
  }
  
  public static boolean doMirrorRabin(long n)
  {
//    int[] P = {2, 7, 61}; // n<4759123141
      int[] P = {2,3,5,7,11,13,17,19,23}; // n=long
      int s = Long.numberOfTrailingZeros(n-1);
      long d = n-1>>s;
      outer:
      for(int a : P){
          if(a >= n)continue;
          
          long mul = a;
          long ad = 1;
          for(long e = d;e > 0;e>>>=1){
              if((e&1)==1)ad = mul(ad, mul, n);
              mul = mul(mul, mul, n);
          }
          if(ad == 1)continue;
          
          for(int r = 0;r < s;r++){
              if(ad == n-1)continue outer;
              ad = mul(ad, ad, n);
          }
          return false;
      }
      return true;
  }

  static long rho(long n)
  {
      Random gen = new Random();
      for(int u = 0;u < 100;u++){
          long ran = (gen.nextLong()&Long.MAX_VALUE) % n;
          long x = 2, y = 2, d = 1;
          while(d == 1){
              x = (mul(x, x, n)+ran)%n;
              y = (mul(y, y, n)+ran)%n;
              y = (mul(y, y, n)+ran)%n;
              d = gcd(Math.abs(x-y), n);
          }
          if(d < n)return d;
      }
      return -1;
  }
  
  public static long gcd(long a, long b) {
      while (b > 0){
          long c = a;
          a = b;
          b = c % b;
      }
      return a;
  }
  
  public static long[] enumDivisors(long n, int[] primes)
  {
      int m = 1;
      long[] divs = {1L};
      int t = 1;
      long u = n;
      for(int p : primes){
          if((long)p*p > u)break;
          int e = 0;
          while(u % p == 0){
              u /= p;
              e++;
          }
          if(e > 0){
              divs = Arrays.copyOf(divs, t*(e+1));
              for(int q = t-1;q >= 0;q--){
                  long b = divs[q];
                  for(int k = 0;k < e;k++){
                      b *= p;
//                    if((long)b*b <= n)divs[t++] = b;
                      divs[t++] = b;
                  }
              }
              m *= e+1;
          }
      }
      if(u > 1){
          long p = u;
          int e = 1;
          divs = Arrays.copyOf(divs, t*(e+1));
          for(int q = t-1;q >= 0;q--){
              long b = divs[q];
              for(int k = 0;k < e;k++){
                  b *= p;
//                if((long)b*b <= n)divs[t++] = b;
                  divs[t++] = b;
              }
          }
          m *= e+1;
      }
      
      return Arrays.copyOf(divs, t);
  }   
  
  public static int[] sieveAtkin(int size) {
    boolean[] isPrime = new boolean[size + 1];
    int sqrtN = (int) Math.sqrt(size);
    int n;
    for (int x = 1; x <= sqrtN; ++x) {
        for (int y = 1; y <= sqrtN; ++y) {
            n = 4 * x * x + y * y;
            if (n <= size && (n % 12 == 1 || n % 12 == 5)) {
                isPrime[n] = !isPrime[n];
            }
            n = 3 * x * x + y * y;
            if (n <= size && n % 12 == 7) {
                isPrime[n] = !isPrime[n];
            }
            n = 3 * x * x - y * y;
            if (x > y && n <= size && n % 12 == 11) {
                isPrime[n] = !isPrime[n];
            }
        }
    }

    for (n = 5; n <= sqrtN; ++n) {
        if (isPrime[n]) {
            for (int k = n * n; k <= size; k += n * n) {
                isPrime[k] = false;
            }
        }
    }
    isPrime[2] = isPrime[3] = true;
    
    int[] ret = new int[size];
    int count = 0;
    for (int i = 1; i < size; i ++) {
        if (isPrime[i]) {
            ret[count ++] = i;
        }
    }
    return Arrays.copyOf(ret, count);
}

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}

