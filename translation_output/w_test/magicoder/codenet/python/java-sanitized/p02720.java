import java.util.*;

public class p02720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Integer> que = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for (int i = 0; i < K; i++) {
            int a = que.pollFirst();
            if (a % 10 != 0) {
                que.addLast(a * 10 + a % 10 - 1);
            }
            que.addLast(a * 10 + a % 10);
            if (a % 10 != 9) {
                que.addLast(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(a);
    }
}