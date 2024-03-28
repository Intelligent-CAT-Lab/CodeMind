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

        int x = sumOfList(A) - N;
        for (int a : A) {
            if (x != a) {
                System.out.println(a);
            }
        }

        scanner.close();
    }

    private static int sumOfList(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}