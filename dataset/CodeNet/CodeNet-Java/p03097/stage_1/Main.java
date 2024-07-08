import java.io.*;
import java.util.*;

public class Main {
  private static int dropBit(int n, int index) {
    int higher = (n >> (index + 1)) << index;
    int lower = (n & ((1 << index) - 1));
//    System.err.printf("n: %d, index: %d, higher: %d, lower: %d\n", n, index, higher, lower);
    return higher | lower;
  }
  
  private static int insertBit(int n, int index, int v) {
    int higher = ((n >> index) << (index + 1));
    int lower = (n & ((1 << index) - 1));
    return higher | lower | v;
  }
  
  private static List<Integer> solveSub(int n, int a, int b) {
//    System.err.printf("n: %d, a: %d, b: %d\n", n, a, b);
    if (n == 1) {
      if (a != b) {
var newVariable_0 = Arrays.asList(a, b);        return newVariable_0;
      } else {
        return null;
      }
    }
    
    for (int i = 0; i < n; i++) {
      int aBit = (a >> i) & 1;
      int bBit = (b >> i) & 1;
      if (aBit != bBit) {
        int aDash = dropBit(a, i);
        int bDash = dropBit(b, i);
//        System.err.printf("i: %d, aDash: %d, bDash: %d\n", i, aDash, bDash);
        int c = aDash ^ 1;
        List<Integer> path1 = solveSub(n - 1, aDash, c);
        List<Integer> path2 = solveSub(n - 1, c, bDash);
        if (path1 != null && path2 != null) {
          List<Integer> path = new ArrayList<>();
          for (int v : path1) {
            path.add(insertBit(v, i, aBit << i));
          }
          for (int v : path2) {
            path.add(insertBit(v, i, bBit << i));
          }
          return path;
        }
        return null;
      }
    }
    return null;
  }
  
  private static List<String> solve(int n, int a, int b) {
    List<Integer> path = solveSub(n, a, b);
    if (path == null) {
var newVariable_1 = Arrays.asList("NO");      return newVariable_1;
    }
    StringBuffer sb = new StringBuffer();
var newVariable_2 = sb.append(path.get(0));var newVariable_3 = path.get(0);    sb.append(newVariable_3);
var newVariable_4 = path.size();    for (int i = 1; i < newVariable_4; i++) {
var newVariable_5 = sb.append(" ");var newVariable_6 = sb.append(path.get(i));var newVariable_7 = path.get(i);      sb.append(newVariable_7);
    }
var newVariable_8 = Arrays.asList("YES", sb.toString());var newVariable_9 = sb.toString();    return Arrays.asList("YES", newVariable_9);
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int a = reader.nextInt();
    int b = reader.nextInt();
    for (String line : solve(n, a, b)) {
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
var newVariable_10 = tokenizer.hasMoreTokens();    while (tokenizer == null || !newVariable_10) {
      try {
var newVariable_11 = reader.readLine();        tokenizer = new java.util.StringTokenizer(newVariable_11);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
var newVariable_12 = tokenizer.nextToken();    return newVariable_12;
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
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
