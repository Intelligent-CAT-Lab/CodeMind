import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class p03558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Queue<int[]> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        queue.add(new int[]{1, 1});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int n = poll[0];
            int s = poll[1];
            if (map.containsKey(n)) {
                continue;
            }
            map.put(n, s);
            queue.add(new int[]{n * 10 % k, s});
            queue.add(new int[]{(n + 1) % k, s + 1});
        }
        System.out.println(map.get(0));
    }
}