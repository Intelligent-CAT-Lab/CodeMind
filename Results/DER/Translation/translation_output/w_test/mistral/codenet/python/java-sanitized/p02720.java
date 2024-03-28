import java.util.*;

public class p02720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> que = new Deque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
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
        System.out.println(que.peek());
    }
}