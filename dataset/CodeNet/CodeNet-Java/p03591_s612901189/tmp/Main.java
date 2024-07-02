import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
System.out.println("[INST]9;None;stok.hasMoreTokens();"+stok.hasMoreTokens());
            String s = br.readLine();
System.out.println("[INST]10;s;br.readLine();"+s);
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    char nextChar() throws IOException {
        return (char) (br.read());
System.out.println("[INST]32;None;br.read();"+br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
System.out.println("[INST]36;None;br.readLine();"+br.readLine());
    }

    void solve() throws IOException {
        String s = nextToken();
        if (s.startsWith("YAKI"))
System.out.println("[INST]41;None;s.startsWith('YAKI');"+s.startsWith("YAKI"));
        {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}