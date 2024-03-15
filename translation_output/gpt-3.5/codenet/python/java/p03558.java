```java
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Pair> q = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        q.add(new Pair(1, 1));
        Map<Integer, Integer> m = new HashMap<>();
        
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int n = pair.getKey();
            int s = pair.getValue();
            if (m.containsKey(n)) continue;
            m.put(n, s);
            q.addFirst(new Pair((n * 10) % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        
        System.out.println(m.get(0));
    }
    
    static class Pair {
        int key;
        int value;
        
        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
        
        public int getKey() {
            return key;
        }
        
        public int getValue() {
            return value;
        }
    }
}
```
