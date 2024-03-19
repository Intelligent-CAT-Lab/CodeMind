import java.util.*;

public class p03558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        queue.add(new int[]{1, 1});
        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int n = pair[0];
            int s = pair[1];
            if (map.containsKey(n)) continue;
            map.put(n, s);
            queue.add(new int[]{n * 10 % K, s});
            queue.add(new int[]{(n + 1) % K, s + 1});
        }
        System.out.println(map.get(0));
    }
}