import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> A = new ArrayList<>();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }

        int x = sum(A) - N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}