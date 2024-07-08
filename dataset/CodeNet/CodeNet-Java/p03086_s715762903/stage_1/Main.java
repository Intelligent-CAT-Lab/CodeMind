import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BATCoder solver = new BATCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class BATCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
var newVariable_0 = Comparator.reverseOrder();            PriorityQueue<Integer> pq = new PriorityQueue<>(newVariable_0);
            int cnt = 0;
var newVariable_1 = s.length();            for (int i = 0; i < newVariable_1; i++) {
var newVariable_2 = s.charAt(i);                if (newVariable_2 == 'A' ||
var newVariable_3 = s.charAt(i);                        newVariable_3 == 'C' ||
var newVariable_4 = s.charAt(i);                        newVariable_4 == 'G' ||
var newVariable_5 = s.charAt(i);                        newVariable_5 == 'T') cnt++;
                else {
var newVariable_6 = pq.add(cnt);                    cnt = 0;
                }
            }
var newVariable_7 = pq.add(cnt);            out.println(pq.poll());
        }

    }
}

