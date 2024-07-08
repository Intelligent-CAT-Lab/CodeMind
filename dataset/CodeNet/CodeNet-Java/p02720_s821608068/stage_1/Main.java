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
var newVariable_0 = queue.add(i);var newVariable_1 = set.add(i);        }
var newVariable_2 = queue.size();        while(newVariable_2 < K) {
            HashSet<Long> new_set = new HashSet<>();
            for (long x : set) {
var newVariable_3 = new_set.add(x);                String s = Long.toString(x);
                char[] d = s.toCharArray();
var newVariable_4 = s.length();                int t = d[newVariable_4 - 1] - '0';
                for (int j = -1; j <= 1; j++) {
                    if (t + j < 0) {
                        continue;
                    }
                    if (9 < t + j) {
                        continue;
                    }
var newVariable_5 = String.valueOf(t + j);                    long n = Long.valueOf(s + newVariable_5);
var newVariable_6 = set.contains(n);                    if (newVariable_6) {
                        continue;
                    }
var newVariable_7 = new_set.contains(n);                    if (newVariable_7) {
                        continue;
                    }
var newVariable_8 = new_set.add(n);var newVariable_9 = queue.add(n);                }
            }
            set = new_set;
        }
        for (int i = 0; i < K - 1; i++) {
var newVariable_10 = queue.poll();        }
        System.out.println(queue.poll());
    }
}
