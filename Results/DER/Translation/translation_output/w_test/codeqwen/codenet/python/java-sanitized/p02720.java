import java.util.LinkedList;
import java.util.Queue;

public class p02720 {
    public static void main(String[] args) {
        int K = Integer.parseInt(System.console().readLine());
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        for (int i = 0; i < K; i++) {
            int a = que.poll();
            if (a % 10 != 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(que.poll());
    }
}