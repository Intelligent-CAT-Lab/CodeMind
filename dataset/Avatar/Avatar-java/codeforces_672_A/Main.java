import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.ceil;

public class A_Summer_Camp {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        String s = " ";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        out.print(s.charAt(n - 1));
        out.close();
    }
}