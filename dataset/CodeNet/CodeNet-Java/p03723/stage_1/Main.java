import java.util.*;
import java.io.*;

public class Main {

    private static PrintWriter out = new PrintWriter(System.out);
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

var newVariable_0 = in.readLine();        st = new StringTokenizer(newVariable_0);

var newVariable_1 = st.nextToken();        long A = Long.parseLong(newVariable_1);
var newVariable_2 = st.nextToken();        long B = Long.parseLong(newVariable_2);
var newVariable_3 = st.nextToken();        long C = Long.parseLong(newVariable_3);

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