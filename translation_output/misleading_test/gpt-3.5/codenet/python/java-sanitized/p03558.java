import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        
        Deque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(1, 1));
        
        Map<Integer, Integer> m = new HashMap<>();
        
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int n = pair.n;
            int s = pair.s;
            
            if (m.containsKey(n)) continue;
            
            m.put(n, s);
            q.addFirst(new Pair((n * 10) % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        
        System.out.println(m.get(0));
    }
    
    static class Pair {
        int n;
        int s;
        
        Pair(int n, int s) {
            this.n = n;
            this.s = s;
        }
    }
}