import java.io.*;
import java.util.*;

public class Main {
  private static List<String> solve(int hL, int wL, int hS, int wS) {
    long limit = 1_000_000_000;
    long positiveElement = (limit - 1) / (hS * wS);
    long negativeElement = -1 * (positiveElement * (hS * wS - 1) + 1);
    long countH = hL / hS;
    long countW = wL / wS;
    long restH = hL % hS;
    long restW = wL % wS;
    long count = countH * countW;
    long rest = restH * wL + restW * hL - restH * restW;
    if (positiveElement * rest - count <= 0) {
var newVariable_0 = Arrays.asList("No");      return newVariable_0;
    }
    List<String> output = new ArrayList<>();
    output.add("Yes");
    for (int i = 0; i < hL; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < wL; j++) {
        if (i % hS == hS - 1 && j % wS == wS - 1) {
var newVariable_1 = sb.append(negativeElement);        } else {
var newVariable_2 = sb.append(positiveElement);        }
var newVariable_3 = sb.append(" ");      }
var newVariable_4 = sb.toString();      output.add(newVariable_4);
    }
    return output;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int hL = reader.nextInt();
    int wL = reader.nextInt();
    int hS = reader.nextInt();
    int wS = reader.nextInt();
    for (String line : solve(hL, wL, hS, wS)) {
      out.println(line);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
var newVariable_5 = tokenizer.hasMoreTokens();    while (tokenizer == null || !newVariable_5) {
      try {
var newVariable_6 = reader.readLine();        tokenizer = new java.util.StringTokenizer(newVariable_6);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
var newVariable_7 = tokenizer.nextToken();    return newVariable_7;
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
  
  ModCalculator(long mod) {
    this.mod = mod;
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
}
 
class ModCombinationCache {
  private final ModCalculator modCalculator;
  private final List<Long> factorialCache;
  private final List<Long> factorialInverseCache;
  
  public ModCombinationCache(ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new ArrayList<>();
    factorialCache.add(1L);
    factorialInverseCache = new ArrayList<>();
    factorialInverseCache.add(1L);
  }
  
  private void resize(int n) {
var newVariable_8 = factorialCache.size();    for (int i = newVariable_8 - 1; i < n; i++) {
var newVariable_9 = factorialCache.get(i);      long v = modCalculator.mul(newVariable_9, i + 1);
      factorialCache.add(v);
      factorialInverseCache.add(modCalculator.inverse(v));
    }
  }
  
  public long getF(int n) {
    resize(n);
var newVariable_10 = factorialCache.get(n);    return newVariable_10;
  }
  
  public long getP(int n, int r) {
    resize(n);
var newVariable_11 = factorialCache.get(n);var newVariable_12 = factorialInverseCache.get(n - r);    return modCalculator.mul(factorialCache.get(n), newVariable_12);
  }
  
  public long getC(int n, int k) {
    resize(n);
var newVariable_13 = factorialCache.get(n);var newVariable_14 = factorialInverseCache.get(k);var newVariable_15 = factorialInverseCache.get(n-k);    return modCalculator.mul(factorialCache.get(n), modCalculator.mul(factorialInverseCache.get(k), newVariable_15));
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
var newVariable_16 = ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]);        newVariable_16 >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
var newVariable_17 = ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]);    while (newVariable_17 >= 0) {
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
