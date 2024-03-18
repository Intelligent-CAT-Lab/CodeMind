import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class p02720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> que = new LinkedList<>();
        
        for (int i = 1; i < 10; i++) {
            que.addLast(i);
        }

        int a = 0;
        for (int i = 0; i < K; i++) {
            a = que.pollFirst();
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