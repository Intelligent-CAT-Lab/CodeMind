import java.util.*;
import java.io.*;

public class p03723 {

    private static PrintWriter out = new PrintWriter(System.out);
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(in.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long count = 0, a, b, c;

        while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {


            if (A == B && B == C) {

                out.println(-1);
                out.flush();
                return;
            }
            
            a = A; b = B; c = C;
            
            A = (b + c) / 2;
            B = (a + c) / 2;
            C = (a + b) / 2;

            count++;
        }

        out.println(count);
        out.flush();
    }
}