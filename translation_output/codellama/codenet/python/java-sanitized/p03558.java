import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class p03558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        HashMap<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            int n = q.removeFirst();
            if (m.containsKey(n)) continue;
            m.put(n, 1);
            q.addFirst(n * 10 % K);
            q.add(n + 1);
        }
        System.out.println(m.get(0));
    }
}