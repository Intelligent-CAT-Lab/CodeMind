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
System.out.println("[INST]27;s;in.next();"+s);
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
System.out.println("[INST]28;None;Comparator.reverseOrder();"+Comparator.reverseOrder());
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
System.out.println("[INST]30;None;s.length();"+s.length());
                if (s.charAt(i) == 'A' ||
System.out.println("[INST]31;None;s.charAt(i);"+s.charAt(i));
                        s.charAt(i) == 'C' ||
System.out.println("[INST]32;None;s.charAt(i);"+s.charAt(i));
                        s.charAt(i) == 'G' ||
System.out.println("[INST]33;None;s.charAt(i);"+s.charAt(i));
                        s.charAt(i) == 'T') cnt++;
System.out.println("[INST]34;None;s.charAt(i);"+s.charAt(i));
                else {
                    pq.add(cnt);
System.out.println("[INST]36;None;pq.add(cnt);"+pq.add(cnt));
                    cnt = 0;
                }
            }
            pq.add(cnt);
System.out.println("[INST]40;None;pq.add(cnt);"+pq.add(cnt));
            out.println(pq.poll());
        }

    }
}

