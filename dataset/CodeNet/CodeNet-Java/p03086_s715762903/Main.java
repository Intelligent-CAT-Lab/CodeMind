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
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A' ||
                        s.charAt(i) == 'C' ||
                        s.charAt(i) == 'G' ||
                        s.charAt(i) == 'T') cnt++;
                else {
                    pq.add(cnt);
                    cnt = 0;
                }
            }
            pq.add(cnt);
            out.println(pq.poll());
        }

    }
}

