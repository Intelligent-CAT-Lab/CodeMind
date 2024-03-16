import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03394 {

    private static final int limit = 30000;

    private static List<Integer> calculatePrimes(int N) {
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];

        for (int i = 0; i < 5000; i++) {
            P2[i] = new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2};
        }
        P2[4999][2] = 2;

        for (int i = 0; i < 2500; i++) {
            P3[i] = new int[]{12 * i + 3, 12 * i + 9};
        }

        List<Integer> P = new ArrayList<>();

        if (N == 3) {
            return List.of(2, 3, 25);
        } else if (N == 4) {
            return List.of(2, 3, 4, 9);
        } else if (N == 6) {
            return List.of(2, 3, 4, 6, 9, 12);
        } else {
            int _k = Math.max(N - 12500, 0) / 3 + (Math.max(N - 12500, 0) % 3 > 0 ? 1 : 0);
            N -= 3 * _k;
            int k = N / 5;
            int m = N % 5;

            if (m == 0) {
                P.addAll(extractList(P2, k + _k, false));
                P.addAll(extractList(P3, k, true));
            } else if (m == 1) {
                P.addAll(extractList(P2, k + 1 + _k, false));
                P.addAll(extractList(P3, k - 1, true));
            } else if (m == 2) {
                P.addAll(extractList(P2, k + _k, false));
                P.addAll(extractList(P3, k + 1, true));
            } else if (m == 3) {
                P.addAll(extractList(P2, k + 1 + _k, false));
                P.addAll(extractList(P3, k, true));
            } else if (k >= 2499) {
                P.addAll(extractList(P2, k + 2 + _k, false));
                P.addAll(extractList(P3, k - 1, true));
            } else {
                P.addAll(extractList(P2, k + _k, false));
                P.addAll(extractList(P3, k + 2, true));
            }
        }

        return P;
    }

    private static List<Integer> extractList(int[][] array, int length, boolean nestedList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int val : array[i]) {
                list.add(val);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        List<Integer> primes = calculatePrimes(N);

        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i));
            if (i < primes.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}