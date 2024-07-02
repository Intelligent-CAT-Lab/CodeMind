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
System.out.println("[INST]13;None;out.flush();"+out.flush());
    }
    long solve(){
        long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong();
System.out.println("[INST]16;a;sc.nextLong();"+a);
System.out.println("[INST]16;b;sc.nextLong();"+b);
System.out.println("[INST]16;n;sc.nextLong();"+n);
        long x = Math.min(b-1,n);
System.out.println("[INST]17;x;Math.min(b-1,n);"+x);
        long up = a*(x%b)-(a%b)*(x%b)%b;
        return up/b;
    }
}

