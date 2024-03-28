import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class p02720 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);
        que.offer(5);
        que.offer(6);
        que.offer(7);
        que.offer(8);
        que.offer(9);
        for (int i = 0; i < K; i++) {
            int a = que.poll();
            if (a % 10!= 0) {
                que.offer(a * 10 + a % 10 - 1);
            }
            que.offer(a * 10 + a % 10);
            if (a % 10!= 9) {
                que.offer(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
    }
}