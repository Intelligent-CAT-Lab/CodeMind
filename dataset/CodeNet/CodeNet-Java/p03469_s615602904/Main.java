import java.io.*;
import java.util.*;

public class Main {
    static FastScanner in;
    static PrintWriter out;
    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        //        Scanner in = new Scanner(new File("input.txt"));
        //        Scanner in = new Scanner(System.in);
        //        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")), true));
        out = new PrintWriter(System.out);
        in = new FastScanner(System.in);
        //        in = new FastScanner("input.txt");
        char s[] = in.next().toCharArray();
        s[3] = '8';
        out.println(String.valueOf(s));
        out.close();
    }
}

class Rect {
    int left;
    int right;
    int top;
    int bottom;

    public Rect(int left, int right, int top, int bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }
}

class Pair {
    public double first; //first member of pair
    public double second; //second member of pair

    public Pair(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Pair))
            return false;
        Pair p = (Pair) o;
        return first == p.first && second == p.second;
    }

    @Override
    public int hashCode() {
        int result = (int) first;
        result = 31 * result + (int) second;
        return result;
    }
}

class PairComparable implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.second < o2.second)
            return -1;
        else if (o1.second > o2.second)
            return 1;
        else {
            return 0;
        }
    }
}

class FastScanner {

    BufferedReader br;
    StringTokenizer tokenizer;

    FastScanner(String fileName) throws FileNotFoundException {
        this(new FileInputStream(new File(fileName)));
    }

    FastScanner(InputStream is) {
        br = new BufferedReader(new InputStreamReader(is));
    }

    String nextLine() throws IOException {
        tokenizer = null;
        return br.readLine();
    }

    String next() throws IOException {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) {
                return null;
            }
            tokenizer = new StringTokenizer(line);
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    char nextChar() throws IOException {
        return next().charAt(0);
    }
}