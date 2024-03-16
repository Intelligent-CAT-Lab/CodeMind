import java.util.Scanner;
import java.util.ArrayList;

public class p03910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }

        int x = 0;
        for (int num : A) {
            x += num;
        }
        x -= N;

        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}