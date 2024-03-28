```java
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Pair> q = new ArrayDeque<>();
        int K = 6;
        q.add(new Pair(1, 1));
        java.util.Map<Integer, Integer> m = new java.util.HashMap<>();
        
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int n = pair.n;
            int s = pair.s;
            if (m.containsKey(n))
                continue;
            m.put(n, s);
            
            q.addFirst(new Pair(n * 10 % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        System.out.println(m.get(0));
    }
    
    static class Pair {
        int n;
        int s;
        
        public Pair(int n, int s) {
            this.n = n;
            this.s = s;
        }
    }
}
```
