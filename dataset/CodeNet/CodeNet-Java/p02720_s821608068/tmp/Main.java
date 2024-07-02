import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
System.out.println("[INST]14;K;scan.nextInt();"+K);
        PriorityQueue<Long> queue = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        for (long i = 1; i <= 9; i++) {
            queue.add(i);
System.out.println("[INST]18;None;queue.add(i);"+queue.add(i));
            set.add(i);
System.out.println("[INST]19;None;set.add(i);"+set.add(i));
        }
        while(queue.size() < K) {
System.out.println("[INST]21;None;queue.size();"+queue.size());
            HashSet<Long> new_set = new HashSet<>();
            for (long x : set) {
                new_set.add(x);
System.out.println("[INST]24;None;new_set.add(x);"+new_set.add(x));
                String s = Long.toString(x);
System.out.println("[INST]25;s;Long.toString(x);"+s);
                char[] d = s.toCharArray();
System.out.println("[INST]26;d;s.toCharArray();"+d);
                int t = d[s.length() - 1] - '0';
System.out.println("[INST]27;None;s.length();"+s.length());
                for (int j = -1; j <= 1; j++) {
                    if (t + j < 0) {
                        continue;
                    }
                    if (9 < t + j) {
                        continue;
                    }
                    long n = Long.valueOf(s + String.valueOf(t + j));
System.out.println("[INST]35;n;Long.valueOf(s + String.valueOf(t + j));"+n);
System.out.println("[INST]35;None;String.valueOf(t + j);"+String.valueOf(t + j));
                    if (set.contains(n)) {
System.out.println("[INST]36;None;set.contains(n);"+set.contains(n));
                        continue;
                    }
                    if (new_set.contains(n)) {
System.out.println("[INST]39;None;new_set.contains(n);"+new_set.contains(n));
                        continue;
                    }
                    new_set.add(n);
System.out.println("[INST]42;None;new_set.add(n);"+new_set.add(n));
                    queue.add(n);
System.out.println("[INST]43;None;queue.add(n);"+queue.add(n));
                }
            }
            set = new_set;
        }
        for (int i = 0; i < K - 1; i++) {
            queue.poll();
System.out.println("[INST]49;None;queue.poll();"+queue.poll());
        }
        System.out.println(queue.poll());
    }
}
