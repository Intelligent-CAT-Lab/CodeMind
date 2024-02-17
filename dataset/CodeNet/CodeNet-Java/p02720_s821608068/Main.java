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
        PriorityQueue<Long> queue = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        for (long i = 1; i <= 9; i++) {
            queue.add(i);
            set.add(i);
        }
        while(queue.size() < K) {
            HashSet<Long> new_set = new HashSet<>();
            for (long x : set) {
                new_set.add(x);
                String s = Long.toString(x);
                char[] d = s.toCharArray();
                int t = d[s.length() - 1] - '0';
                for (int j = -1; j <= 1; j++) {
                    if (t + j < 0) {
                        continue;
                    }
                    if (9 < t + j) {
                        continue;
                    }
                    long n = Long.valueOf(s + String.valueOf(t + j));
                    if (set.contains(n)) {
                        continue;
                    }
                    if (new_set.contains(n)) {
                        continue;
                    }
                    new_set.add(n);
                    queue.add(n);
                }
            }
            set = new_set;
        }
        for (int i = 0; i < K - 1; i++) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}
