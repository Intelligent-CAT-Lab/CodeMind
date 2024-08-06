
import java.util.Arrays;


class SuffixArray {

  
  public static int[] suffixArray(char[] str, int W)
  {
      int n = str.length;
      if(n <= 1)return new int[n];
      int[] sa = new int[n];
      int[] s = new int[n+3];
      for(int i = 0;i < n;i++)s[i] = str[i] - 'a' + 1;
      suffixArray(s, sa, n, W+1);
      return sa;
  }
  
  public static void suffixArray(int[] s, int[] sa, int n, int K)
  {
      int n0 = (n+2)/3, n1 = (n+1)/3, n2 = n/3, n02 = n0 + n2;
      int[] s12 = new int[n02+3]; 
      int[] sa12 = new int[n02+3];
      int[] s0 = new int[n0];
      int[] sa0 = new int[n0];
      
      // generate positions of mod 1 and mod 2 suffixes
      // the "+(n0-n1)" adds a dummy mod 1 suffix if n%3 == 1
      int sup = n+(n0-n1);
      for(int i = 0, j = 0;i < sup;i+=3){
          if(i+1 < sup)s12[j++] = i+1;
          if(i+2 < sup)s12[j++] = i+2;
      }
      
      // lsb radix sort the mod 1 and mod 2 triples
      radixPass(s12, sa12, s, 2, n02, K);
      radixPass(sa12, s12, s, 1, n02, K);
      radixPass(s12, sa12, s, 0, n02, K);

      // find lexicographic names of triples
      int name = 0, c0 = -1, c1 = -1, c2 = -1;
      for(int i = 0;i < n02;i++){
          if(s[sa12[i]] != c0 || s[sa12[i]+1] != c1 || s[sa12[i]+2] != c2){
              name++;
              c0 = s[sa12[i]];
              c1 = s[sa12[i]+1];
              c2 = s[sa12[i]+2];
          }
          if(sa12[i] % 3 == 1){
              s12[sa12[i]/3] = name; // left half
          }else{
              s12[sa12[i]/3 + n0] = name; // right half
          }
      }
      
      // recurse if names are not yet unique
      if(name < n02){
          suffixArray(s12, sa12, n02, name);
          // store unique names in s12 using the suffix array
          for(int i = 0;i < n02;i++)s12[sa12[i]] = i+1;
      }else{
          // generate the suffix array of s12 directly
          for(int i = 0;i < n02;i++)sa12[s12[i]-1] = i;
      }
      
      // stably sort the mod 0 suffixes from sa12 by their first character
      for(int i = 0, j = 0;i < n02;i++){
          if(sa12[i] < n0)s0[j++] = 3 * sa12[i];
      }
      radixPass(s0, sa0, s, 0, n0, K);
      
      // merge sorted sa0 suffixes and sorted sa12 suffixes
      for(int p = 0, t = n0-n1, k = 0;k < n;k++){
          int i = sa12[t] < n0 ? sa12[t] * 3 + 1 : (sa12[t] - n0) * 3 + 2; // pos of current offset 12 suffix
          int j = sa0[p]; // pos of current offset 0 suffix
          if(sa12[t] < n0 ?
                  (s[i] < s[j] || s[i] == s[j] && s12[sa12[t]+n0] <= s12[j/3]) :
                  (s[i] < s[j] || s[i] == s[j] && (s[i+1] < s[j+1] || s[i+1] == s[j+1] && s12[sa12[t]-n0+1] <= s12[j/3+n0]))
                  ){
              // suffix from a12 is smaller
              sa[k] = i;
              t++;
              if(t == n02){
                  // done --- only sa0 suffixes left
                  for(k++;p < n0;p++,k++)sa[k] = sa0[p];
              }
          }else{
              // suffix from sa0 is smaller
              sa[k] = j; p++;
              if(p == n0){
                  // done --- only sa12 suffixes left
                  for(k++; t < n02;t++,k++)sa[k] = sa12[t] < n0 ? sa12[t] * 3 + 1 : (sa12[t] - n0) * 3 + 2;
              }
          }
      }
  }
  
  /**
   * radixsort a by r's value, and store a's index to b.
   * @param a
   * @param b
   * @param r
   * @param l
   * @param n
   * @param K
   */
  public static void radixPass(int[] a, int[] b, int[] r, int l, int n, int K)
  {
      int[] c = new int[K+1]; // counter array
      for(int i = 0;i < n;i++)c[r[l+a[i]]]++; // count occurrences
      for(int i = 0, sum = 0;i <= K;i++){ // exclusive prefix sums
          int t = c[i]; c[i] = sum; sum += t;
      }
      for(int i = 0;i < n;i++)b[c[r[l+a[i]]]++] = a[i];
  }
  
  static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }

  /**
   * 速いSuffixArrayのLCP作成
   * @param str
   * @param sa
   * @return
   */
  public static int[] buildLCP0(char[] str, int[] sa)
  {
      int n = str.length;
      int h = 0;
      int[] lcp = new int[n];
      int[] b = new int[n];
      for(int i = 0;i < n;i++)b[sa[i]] = i;
      for(int i = 0;i < n;i++){
          if(b[i] > 0){
              for(int j = sa[b[i]-1]; j+h<n && i+h<n && str[j+h] == str[i+h]; h++);
              lcp[b[i]] = h;
          }else{
              lcp[b[i]] = 0;
          }
          if(h > 0)h--;
      }
      return lcp;
  }   
}

public class Main {

  private static void solve() {
    char[] s = ns();
    int[] sa = SuffixArray.suffixArray(s, 50);
    int[] lcp = SuffixArray.buildLCP0(s, sa);
    
    int n = s.length;
    int[] imos = new int[n + 1];
    
    for (int i = 0; i < n; i ++) {
      imos[lcp[i]] ++;
    }
    
    for (int i = 0; i < n; i ++) {
      imos[i + 1] += imos[i];
    }
    
    int max = 0;
    for (int i = 0; i < n; i ++) {
      max = Math.max(max, imos[i] - i);
    }
    
    System.out.println(max);
  }



  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = System.getProperty("debug");
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
      a[i] = ni();
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
