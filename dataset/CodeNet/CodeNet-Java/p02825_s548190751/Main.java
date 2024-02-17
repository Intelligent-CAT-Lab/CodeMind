import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    final boolean ONLINE_JUDGE = true;
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
    }

    void init() throws FileNotFoundException {
        if (ONLINE_JUDGE) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            init();
            solve();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    class lolkek implements Comparable<lolkek> {
        int x;
        int y;

        public lolkek(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(lolkek a) {
            if (x == a.x) {
                return (y - a.y);
            }
            return x - a.x;
        }
    }

    public boolean isSimple(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
            if(i * i > n) {
                break;
            }
        }
        return true;
    }

    char[][] ans;

    void fill3(int i) {
        ans[i][i+ 1] = 'a';
        ans[i][i + 2] = 'a';
        ans[i + 1][i] = 'b';
        ans[i + 2][i] = 'b';
    }
    void fill4(int i) {
        ans[i][i] = 'a';
        ans[i][i+1] = 'a';
        ans[i+1][i] = 'b';
        ans[i+1][i+1] = 'b';
        ans[i][i+2] = 'c';
        ans[i+1][i+2] = 'c';
        ans[i][i+3] = 'd';
        ans[i+1][i+3] = 'd';
        ans[i+2][i] = 'e';
        ans[i+3][i] = 'e';
        ans[i+2][i+1] = 'f';
        ans[i+3][i+1] = 'f';
        ans[i+2][i+2] = 'g';
        ans[i+2][i+3] = 'g';
        ans[i+3][i+2] = 'h';
        ans[i+3][i+3] = 'h';
    }

    void fill5(int i) {
        ans[i][i] = 'a';
        ans[i+1][i] = 'a';
        ans[i][i+1] = 'b';
        ans[i][i+2] = 'b';
        ans[i][i+3] = 'c';
        ans[i][i+4] = 'c';
        ans[i+2][i] = 'd';
        ans[i+3][i] = 'd';
        ans[i+1][i+1] = 'e';
        ans[i+2][i+1] = 'e';
        ans[i+4][i] = 'f';
        ans[i+4][i+1] = 'f';
        ans[i+4][i+2] = 'g';
        ans[i+4][i+3] = 'g';
        ans[i+3][i+2] = 'h';
        ans[i+3][i+3] = 'h';
        ans[i+4][i+4] = 'i';
        ans[i+3][i+4] = 'i';
        ans[i+2][i+4] = 'k';
        ans[i+1][i+4] = 'k';
    }

    void fill7(int i) {
        ans[i][i+2] = 'a';
        ans[i][i+3] = 'a';
        ans[i][i+4] = 'b';
        ans[i][i+5] = 'b';
        ans[i][i+6] = 'c';
        ans[i+1][i+6] = 'c';
        ans[i+2][i+6] = 'd';
        ans[i+3][i+6] = 'd';
        ans[i+4][i+6] = 'e';
        ans[i+5][i+6] = 'e';
        ans[i+4][i+5] = 'f';
        ans[i+5][i+5] = 'f';
        ans[i+6][i+5] = 'g';
        ans[i+6][i+4] = 'g';
        ans[i+6][i+3] = 'h';
        ans[i+6][i+2] = 'h';
        ans[i+6][i+1] = 'i';
        ans[i+6][i] = 'i';
        ans[i+5][i] = 'k';
        ans[i+4][i] = 'k';
        ans[i+1][i+1] = 'l';
        ans[i+2][i+1] = 'l';
        ans[i+3][i+1] = 'm';
        ans[i+3][i+2] = 'm';
        ans[i+1][i+3] = 'n';
        ans[i+1][i+4] = 'n';
        ans[i+3][i] = 'o';
        ans[i+2][i] = 'o';
    }

    void printAns(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) out.print(ans[i][j]);
            out.println();
        }
    }
    public void solve() throws IOException {
        int n = readInt();
        if(n == 2) {
            out.println(-1);
            return;
        }
        ans = new char[n][n];
        for(int i = 0; i < n*n; i++) ans[i/n][i%n] = '.';

        if(n % 3 == 0) {
            for(int i = 0; i < n; i += 3)
            fill3(i);
        }
        else if(n == 7) {
            fill7(0);
        }
        else if(n == 11) {
            fill7(0);
            fill4(7);
        }
        else {
            if(n % 4 == 0) {
                for(int i = 0; i < n; i+=4) fill4(i);
            }
            else if(n % 4 == 1) {
                for(int i = 0; i < n-5; i+=4) fill4(i);
                fill5(n-5);
            }
            else if(n % 4 == 2) {
                for(int i = 0; i < n-10; i+=4) fill4(i);
                fill5(n-5);
                fill5(n-10);
            }
            else {
                for(int i = 0; i < n-15; i+=4) fill4(i);
                fill5(n-5);
                fill5(n-10);
                fill5(n - 15);
            }
        }
        printAns(n);
    }
}