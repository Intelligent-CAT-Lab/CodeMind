import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p02720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= 9; i++) {
            queue.add(i);
        }
        for (int i = 0; i < K; i++) {
            int a = queue.poll();
            if (a % 10!= 0) {
                queue.add(a * 10 + a % 10 - 1);
            }
            queue.add(a * 10 + a % 10);
            if (a % 10!= 9) {
                queue.add(a * 10 + a % 10 + 1);
            }
        }
        System.out.println(queue.peek());
    }
}