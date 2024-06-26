import java.io.*;
import java.util.*;

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    out.println(new Solver(n, k).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
System.out.println("[INST]14;None;out.flush();"+out.flush());
  }
}

class Solver {
  final int n, k;
  ModCalculator mc;
  
  Solver(int n, int k) {
    this.n = n;
    this.k = k;
  }
  
  private long calculateOrder1() {
    long[][] dptable = new long[n][n];
    dptable[n - 1][0] = 1;
    for (int i = 0; i < k; i++) {
      for (int j = 0; j <= n - 1 - i; j++) {
        // dptable[j][n - 1 - i - j]
        int t = n - 1 - i - j;
        for (int k = 1; k <= j; k++) {
          dptable[j - k][t + k - 1] = mc.add(dptable[j - k][t + k - 1], dptable[j][t]);
        }
        if (t > 0) {
          dptable[j][t - 1] = mc.add(dptable[j][t - 1], dptable[j][t]);
        }
        
        // dptable[j - k][t + k - 1] = mc.add(dptable[j - k][t + k - 1], dptable[j][t]);
        // a = j - k
        // b = t + k - 1
        // j = a + k
        // t = b - k + 1
        // dptable[a][b] += dptable[a+k][b-k+1]
        
        
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.err.printf("%7d", dptable[i][j]);
System.out.println("[INST]53;None;System.err.printf('%7d', dptable[i][j]);"+System.err.printf("%7d", dptable[i][j]));
      }
      System.err.println();
    }
    
    
    long sum = 0;
    for (int j = 0; j <= n - k; j++){
      sum = mc.add(sum, dptable[j][n - k - j]);
    }
    return sum;
  }
  
  private long calculateOrder2() {
    long[][] dptable = new long[n][n];
    dptable[n - 1][0] = 1;
    for (int i = 0; i < k-1; i++) {
      dptable[n - 1 - i - 1][0] = mc.add(dptable[n - 1 - i][0], dptable[n-1-i-1][1]);
      for (int j = 1; n - 1 - i - 1 - j >= 0; j++) {
        dptable[n - 1 - i - 1 - j][j] = mc.add(dptable[n - 1 - i - 1 - j + 1][j - 1], dptable[n - 1 - i - 1 - j][j + 1]);
      }
      /*
      for (int j = 0; j <= n - 1 - i; j++) {
        // dptable[j][n - 1 - i - j]
        int t = n - 1 - i - j;
        for (int k = 1; k <= j; k++) {
          dptable[j - k][t + k - 1] = mc.add(dptable[j - k][t + k - 1], dptable[j][t]);
        }
        if (t > 0) {
          dptable[j][t - 1] = mc.add(dptable[j][t - 1], dptable[j][t]);
        }
        
        // dptable[j - k][t + k - 1] = mc.add(dptable[j - k][t + k - 1], dptable[j][t]);
        // a = j - k
        // b = t + k - 1
        // j = a + k
        // t = b - k + 1
        // dptable[a][b] += dptable[a+k][b-k+1]
        
        
      }
      */
    }
    /*
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.err.printf("%7d", dptable[i][j]);
      }
      System.err.println();
    }
    */
    
    
    long sum = 0;
    for (int j = 0; j <= n - k; j++){
      sum = mc.add(sum, dptable[j][n - k - j]);
    }
    return sum;
  }
  
  public long solve() {
    mc = new ModCalculator(1_000_000_007L);
    
//    long v11 = calculateOrder1();
    long v12 = calculateOrder2();
    long v2 = mc.pow(2, n - k - 1);
//    System.err.printf("%d %d\n", v11, v12);
//    System.err.printf("%d %d\n", v12, v2);
    return mc.mul(v12, v2);
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]134;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
System.out.println("[INST]136;None;reader.readLine();"+reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
System.out.println("[INST]141;None;tokenizer.nextToken();"+tokenizer.nextToken());
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}

class ModCalculator {
  private final long mod;
  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
  
  public long getF(int n) {
    return modCombinationCache.getF(n);
  }
  
  public long getP(int n, int r) {
    return modCombinationCache.getP(n, r);
  }
  
  public long getC(int n, int k) {
    return modCombinationCache.getC(n, k);
  }
  
  class ModCombinationCache {
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new ArrayList<>();
      factorialCache.add(1L);
      factorialInverseCache = new ArrayList<>();
      factorialInverseCache.add(1L);
    }
    
    private void resize(int n) {
      for (int i = factorialCache.size() - 1; i < n; i++) {
System.out.println("[INST]284;None;factorialCache.size();"+factorialCache.size());
        long v = mul(factorialCache.get(i), i + 1);
System.out.println("[INST]285;None;factorialCache.get(i);"+factorialCache.get(i));
        factorialCache.add(v);
        factorialInverseCache.add(inverse(v));
      }
    }
    
    long getF(int n) {
      resize(n);
      return factorialCache.get(n);
System.out.println("[INST]293;None;factorialCache.get(n);"+factorialCache.get(n));
    }
    
    long getP(int n, int r) {
      resize(n);
      return mul(factorialCache.get(n), factorialInverseCache.get(n - r));
System.out.println("[INST]298;None;factorialCache.get(n);"+factorialCache.get(n));
System.out.println("[INST]298;None;factorialInverseCache.get(n - r);"+factorialInverseCache.get(n - r));
    }
    
    long getC(int n, int k) {
      resize(n);
      return mul(factorialCache.get(n), mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
System.out.println("[INST]303;None;factorialCache.get(n);"+factorialCache.get(n));
System.out.println("[INST]303;None;factorialInverseCache.get(k);"+factorialInverseCache.get(k));
System.out.println("[INST]303;None;factorialInverseCache.get(n-k);"+factorialInverseCache.get(n-k));
    }
  }
}
 
class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
System.out.println("[INST]318;None;ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]);"+ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]));
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
System.out.println("[INST]326;None;ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]);"+ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]));
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

class UnionFind {
  int[] parents;
  int[] ranks;

  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];

    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }

  public int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }

  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }

  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
}
