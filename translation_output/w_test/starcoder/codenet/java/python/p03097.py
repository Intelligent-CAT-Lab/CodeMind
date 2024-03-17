<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 3

Expected output:
YES
1 0 2 3


```
import java.io.*;
import java.util.*;

public class p03097 {
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
      if (a!= b) {
        return Arrays.asList(a, b);
      } else {
        return null;
      }
    }
    
    for (int i = 0; i < n; i++) {
      int aBit = (a >> i) & 1;
      int bBit = (b >> i) & 1;
      if (aBit!= bBit) {
        int aDash = dropBit(a, i);
        int bDash = dropBit(b, i);
//        System.err.printf("i: %d, aDash: %d, bDash: %d\n", i, aDash, bDash);
        int c = aDash ^ 1;
        List<Integer> path1 = solveSub(n - 1, aDash, c);
        List<Integer> path2 = solveSub(n - 1, c, bDash);
        if (path1!= null && path2!= null) {
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
    }
    StringBuffer sb = new StringBuffer();
    sb.append(path.get(0));
    for (int i = 1; i < path.size(); i++) {
      sb.append(" ");
      sb.append(path.get(i));
    }
    return Arrays.asList("YES", sb.toString());
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
    while (tokenizer == null ||!tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
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

```

python code:<fim_suffix><fim_middle>

```python
import sys

def dropBit(n, index):
    higher = (n >> (index + 1)) << index
    lower = (n & ((1 << index) - 1))
    return higher | lower

def insertBit(n, index, v):
    higher = ((n >> index) << (index + 1))
    lower = (n & ((1 << index) - 1))
    return higher | lower | v

def solveSub(n, a, b):
    if n == 1:
        if a!= b:
            return [a, b]
        else:
            return None
    for i in range(n):
        aBit = (a >> i) & 1
        bBit = (b >> i) & 1
        if aBit!= bBit:
            aDash = dropBit(a, i)
            bDash = dropBit(b, i)
            c = aDash ^ 1
            path1 = solveSub(n - 1, aDash, c)
            path2 = solveSub(n - 1, c, bDash)
            if path1!= None and path2!= None:
                path = []
                for v in path1:
                    path.append(insertBit(v, i, aBit << i))
                for v in path2:
                    path.append(insertBit(v, i, bBit << i))
                return path
            return None
    return None

def solve(n, a, b):
    path = solveSub(n, a, b)
    if path == None:
        return ["NO"]
    sb = []
    sb.append(str(path[0]))
    for i in range(1, len(path)):
        sb.append(" ")
        sb.append(str(path[i]))
    return ["YES"] + sb

def execute(reader, writer):
    n = reader.nextInt()
    a = reader.nextInt()
    b = reader.nextInt()
    for line in solve(n, a, b):
        writer.println(line)

if __name__ == "__main__":
    reader = ContestReader(sys.stdin)
    writer = PrintWriter(sys.stdout)
    execute(reader, writer)
    writer.flush()

class ContestReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream))
        self.tokenizer = None

   
