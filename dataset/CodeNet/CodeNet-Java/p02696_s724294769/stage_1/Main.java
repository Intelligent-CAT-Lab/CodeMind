import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long[] res;
    ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve(){
        long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong();
        long x = Math.min(b-1,n);
        long up = a*(x%b)-(a%b)*(x%b)%b;
        return up/b;
    }
}

