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
        return Arrays.asList(a, b);
System.out.println("[INST]21;None;Arrays.asList(a, b);"+Arrays.asList(a, b));
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
      return Arrays.asList("NO");
System.out.println("[INST]56;None;Arrays.asList('NO');"+Arrays.asList("NO"));
    }
    StringBuffer sb = new StringBuffer();
    sb.append(path.get(0));
System.out.println("[INST]59;None;sb.append(path.get(0));"+sb.append(path.get(0)));
System.out.println("[INST]59;None;path.get(0);"+path.get(0));
    for (int i = 1; i < path.size(); i++) {
System.out.println("[INST]60;None;path.size();"+path.size());
      sb.append(" ");
System.out.println("[INST]61;None;sb.append(' ');"+sb.append(" "));
      sb.append(path.get(i));
System.out.println("[INST]62;None;sb.append(path.get(i));"+sb.append(path.get(i)));
System.out.println("[INST]62;None;path.get(i);"+path.get(i));
    }
    return Arrays.asList("YES", sb.toString());
System.out.println("[INST]64;None;Arrays.asList('YES', sb.toString());"+Arrays.asList("YES", sb.toString()));
System.out.println("[INST]64;None;sb.toString();"+sb.toString());
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
System.out.println("[INST]80;None;out.flush();"+out.flush());
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
System.out.println("[INST]93;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
System.out.println("[INST]95;None;reader.readLine();"+reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
System.out.println("[INST]100;None;tokenizer.nextToken();"+tokenizer.nextToken());
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
