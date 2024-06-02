import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {
  final long x, y;

  Point(long x, long y) {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Point point) {
    if (this.x != point.x) {
      return Long.compare(this.x, point.x);
    }
    return Long.compare(this.y, point.y);
  }

  public String toString() {
    return String.format("(%d, %d)", x, y);
  }
}

class NaiveSolver {
  final int w, h, k;

  NaiveSolver(int w, int h, int k) {
    this.w = w;
    this.h = h;
    this.k = k;
  }

  private static long gcdRec(long a, long b) {
    return a % b == 0 ? b : gcd(b, a % b);
  }

  private static long gcd(long a, long b) {
    long absA = Math.abs(a);
    long absB = Math.abs(b);
    if (absA == 0 || absB == 0) {
      return absA + absB;
    }
    return gcdRec(absA, absB);
  }

  private boolean accept(long x1, long y1, long x2, long y2, long x3, long y3) {
    long dx2 = x2 - x1;
    long dy2 = y2 - y1;
    long dx3 = x3 - x1;
    long dy3 = y3 - y1;
    long sDouble = Math.abs(dx2 * dy3 - dx3 * dy2);
    long g1 = gcd(x1 - x2, y1 - y2);
    long g2 = gcd(x2 - x3, y2 - y3);
    long g3 = gcd(x3 - x1, y3 - y1);
    long g = g1 + g2 + g3;
    return sDouble - g + 2 <= 2 * k;
  }

  public long solve() {
    long answer = 0;
    for (long x1 = 1; x1 < w; x1++) {
      for (long y1 = 1; y1 < h; y1++) {
        for (long x2 = 1; x2 < w; x2++) {
          //(x1, 0), (0, y1), (x2, h)
          //(x1, 0), (w, y1), (x2, h)
          if (accept(x1, 0, 0, y1, x2, h)) {
            answer++;
          }
          if (accept(x1, 0, w, y1, x2, h)) {
            answer++;
          }
        }
        for (long y2 = 1; y2 < h; y2++) {
          //(x1, 0), (0, y1), (w, y2)
          //(x1, h), (0, y1), (w, y2)
          if (accept(x1, 0, 0, y1, w, y2)) {
            answer++;
          }
          if (accept(x1, h, 0, y1, w, y2)) {
            answer++;
          }
        }
      }
    }
    return answer;
  }

  private void addAnswer(List<List<Point>> answers, long x1, long y1, long x2, long y2, long x3, long y3) {
    List<Point> list = List.of(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    List<Point> sortedList = new ArrayList<>();
    sortedList.addAll(list);
    Collections.sort(sortedList);
    answers.add(sortedList);
  }

  public List<List<Point>> solveList() {
    List<List<Point>> answers = new ArrayList<>();
    for (long x1 = 1; x1 < w; x1++) {
      for (long y1 = 1; y1 < h; y1++) {
        for (long x2 = 1; x2 < w; x2++) {
          //(x1, 0), (0, y1), (x2, h)
          //(x1, 0), (w, y1), (x2, h)
          if (accept(x1, 0, 0, y1, x2, h)) {
            addAnswer(answers, x1, 0L, 0L, y1, x2, (long)h);
          }
          if (accept(x1, 0, w, y1, x2, h)) {
            addAnswer(answers, x1, 0L, (long)w, y1, x2, (long)h);
          }
        }
        for (long y2 = 1; y2 < h; y2++) {
          //(x1, 0), (0, y1), (w, y2)
          //(x1, h), (0, y1), (w, y2)
          if (accept(x1, 0, 0, y1, w, y2)) {
            addAnswer(answers, x1, 0L, 0L, y1, (long)w, y2);
          }
          if (accept(x1, h, 0, y1, w, y2)) {
            addAnswer(answers, x1, (long)h, 0L, y1, (long)w, y2);
          }
        }
      }
    }
    Collections.sort(answers, new Comparator<List<Point>>(){
      public int compare(List<Point> l1, List<Point> l2) {
        for (int i = 0; i < l1.size(); i++) {
          int result = l1.get(i).compareTo(l2.get(i));
          if (result != 0) {
            return result;
          }
        }
        return 0;
      }
    });
    return answers;
  }
}

class SubSolver {
  final int w, h, k;
  final boolean rotate;

  SubSolver(int w, int h, int k, boolean rotate) {
    this.w = w;
    this.h = h;
    this.k = k;
    this.rotate = rotate;
  }

  private static long gcd(long a, long b) {
    if (a == 0 || b == 0) {
      return a + b;
    }
    return a % b == 0 ? b : gcd(b, a % b);
  }

  // P1: (x, 0)
  // P2: (0, y)
  // P3: (w, y + s)
  // (0 < x < w),
  // (0 < y < h)
  // (0 <= s < h - 1)
  // TriangleArea = NumLatticeInside + NumLatticeBoundary / 2 - 1
  // NumLatticeInside = TriangleArea - NumLatticeBoundary / 2 + 1
  // NumLatticeInside <= k
  // TriangleArea - NumLatticeBoundary / 2 + 1 <= k
  // 2 * TriangleArea - NumLatticeBoundary + 2 <= 2k
  // TriangleArea
  // = (y + y + s) * w / 2 - x * y / 2 - (w - x) * (y + s) / 2
  // = yw + sw/2 - xy/2 - wy/2 - ws/2 + xy/2 + xs/2
  // = yw/2 + xs/2
  // NumLatticeBoundary
  // = gcd(s, w) + gcd(x, y) + gcd(w - x, y + s)
  // 2 * (yw / 2 + xs/2) - gcd(s, w) - gcd(x, y) - gcd(w - x, y + s) + 2 <= 2k
  // wy - gcd(x, y) - gcd(w - x, y + s) <= 2k + gcd(s, w) - xs - 2
  // 2k + gcd(s, w) - xs - 2 >= 0
  // sx <= 2k + gcd(s, w) - 2 <= 2k + w - 2
  public long solve() {
    long answer = 0;
    // s == 0
    for (long x = 1; x < w; x++) {
      answer += solve(0, x);
    }

    for (long s = 1; s < h - 1; s++) {
      long gcdSw = gcd(s, w);
      for (long x = 1; x < w && s * x <= 2 * k + gcdSw - 2; x++) {
        answer += 2 * solve(s, x);
      }
    }

    return answer;
  }

  private long solve(long s, long x) {
    long r = 2 * k + gcd(s, w) - s * x - 2;
    // y + s < h
    // y < h - s
    // y <= h - s - 1
    long answer = Math.min(r / w, h - s - 1);
    boolean a = false;
    if (accept(s, x, r, r / w + 1)) {
      a = true;
      answer++;
    }
//    System.err.printf("%d %d %s %d\n", s, x, a, answer);
    return answer;
  }

  private boolean accept(long s, long x, long r, long y) {
    return y + s < h && w * y - gcd(x, y) - gcd(w - x, y + s) <= r;
  }

  public List<List<Point>> solveList() {
    List<List<Point>> answers = new ArrayList<>();
    // s == 0
    for (long x = 1; x < w; x++) {
      answers.addAll(solveList(0, x));
    }

    for (long s = 1; s < h - 1; s++) {
      long gcdSw = gcd(s, w);
      for (long x = 1; x < w && s * x <= 2 * k + gcdSw - 2; x++) {
        answers.addAll(solveList(s, x));
      }
    }

    return answers;
  }

  private List<List<Point>> solveList(long s, long x) {
    List<List<Point>> answers = new ArrayList<>();

    long r = 2 * k + gcd(s, w) - s * x - 2;
    /*
    long answer = r / w;
    boolean a = false;
    if (accept(s, x, r, r / w + 1)) {
      a = true;
      answer++;
    }
    System.err.printf("%d %d %s %d\n", s, x, a, answer);
    */
    for (int y = 1; y <= r / w && y + s < h; y++) {
      addAnswer(answers, s, x, y);
    }
    if (accept(s, x, r, r / w + 1)) {
      addAnswer(answers, s, x, r / w + 1);
    }
    return answers;
  }

  private void addAnswer(List<List<Point>> answers, long s, long x, long y) {
    if (y + s < 0 || y + s > h) {
      System.err.printf("%d %d %d\n", s, x, y);
      throw new RuntimeException();
    }
    {
      addAnswer1(answers, x,     0, 0, y, w, y + s);
    }
    if (s != 0) {
      addAnswer1(answers, w - x, 0, w, y, 0, y + s);
    }   
  }

  private void addAnswer1(List<List<Point>> answers, long x1, long y1, long x2, long y2, long x3, long y3) {
    if (y3 < 0 || y3 > h) {
      System.err.printf("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
      throw new RuntimeException();
    }
    addAnswer2(answers, x1, y1, x2, y2, x3, y3);
    addAnswer2(answers, x1, h - y1, x2, h - y2, x3, h - y3);
  }

  private void addAnswer2(List<List<Point>> answers, long x1, long y1, long x2, long y2, long x3, long y3) {
    if (x1 < 0 || x2 < 0 || x3 < 0 || y1 < 0 || y2 < 0 || y3 < 0) {
      System.err.printf("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
      throw new RuntimeException();
    }
    if (!rotate) {
      addAnswer3(answers, x1, y1, x2, y2, x3, y3);
    } else {
      addAnswer3(answers, y1, x1, y2, x2, y3, x3);
    }
  }

  private void addAnswer3(List<List<Point>> answers, long x1, long y1, long x2, long y2, long x3, long y3) {
    if (x1 < 0 || x2 < 0 || x3 < 0 || y1 < 0 || y2 < 0 || y3 < 0) {
      System.err.printf("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
      throw new RuntimeException();
    }
    List<Point> list = List.of(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    List<Point> sortedList = new ArrayList<>();
    sortedList.addAll(list);
    Collections.sort(sortedList);
    answers.add(sortedList);
  }
}

class Solver {
  final int w, h, k;

  Solver(int w, int h, int k) {
    this.w = w;
    this.h = h;
    this.k = k;
  }

  public long solve() {
    SubSolver subSolver1 = new SubSolver(w, h, k, false);
    SubSolver subSolver2 = new SubSolver(h, w, k, true);
    long answer1 = subSolver1.solve();
    long answer2 = subSolver2.solve();
    return 2 * (answer1 + answer2);
  }

  public List<List<Point>> solveList() {
    SubSolver subSolver1 = new SubSolver(w, h, k, false);
    SubSolver subSolver2 = new SubSolver(h, w, k, true);
    List<List<Point>> answers = new ArrayList<>();
    answers.addAll(subSolver1.solveList());
    answers.addAll(subSolver2.solveList());
    Collections.sort(answers, new Comparator<List<Point>>(){
      public int compare(List<Point> l1, List<Point> l2) {
        for (int i = 0; i < l1.size(); i++) {
          int result = l1.get(i).compareTo(l2.get(i));
          if (result != 0) {
            return result;
          }
        }
        return 0;
      }
    });
    return answers;
  }
}

public class p02650 {
  private static void execute(ContestReader reader, ContestWriter out) {
    int w = reader.nextInt();
    int h = reader.nextInt();
    int k = reader.nextInt();
    out.println(new Solver(w, h, k).solve());
//    out.println(new NaiveSolver(w, h, k).solve());
//    out.printList(new NaiveSolver(w, h, k).solveList());
//    out.printList(new Solver(w, h, k).solveList());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printStream) {
    super(printStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
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
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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

class MyAssert {
  public static void myAssert(boolean flag, String message) {
    if (!flag) {
      throw new RuntimeException(message);
    }
  }
 
  public static void myAssert(boolean flag) {
    myAssert(flag, "");
  }
}
