import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class p02720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Deque<Long> que = new ArrayDeque<>();

        for (int i = 1; i <= 9; i++) {
            que.addLast((long) i);
        }

        long a = 0;
        for (int i = 0; i < K; i++) {
            a = que.pollFirst();
            if (a % 10 != 0) {
                que.addLast(a * 10 + (a % 10) - 1);
            }
            que.addLast(a * 10 + (a % 10));
            if (a % 10 != 9) {
                que.addLast(a * 10 + (a % 10) + 1);
            }
        }

        System.out.println(a);
        scanner.close();
    }
}