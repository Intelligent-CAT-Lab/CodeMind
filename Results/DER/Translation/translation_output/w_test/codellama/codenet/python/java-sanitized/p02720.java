import java.util.Deque;
import java.util.LinkedList;

public class p02720 {
    public static void main(String[] args) {
        int K = Integer.parseInt(args[0]);
        Deque<Integer> que = new LinkedList<>();
        for (int i = 1; i <= 9; i++) {
            que.add(i);
        }
        for (int i = 0; i < K; i++) {
            int a = que.removeFirst();
            if (a % 10 != 0) {
                que.add(a * 10 + a % 10 - 1);
            }
            que.add(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(que.getFirst());
    }
}