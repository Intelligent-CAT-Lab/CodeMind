import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03394 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<int[]> P2 = new ArrayList<>();
        List<int[]> P3 = new ArrayList<>();
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2.add(new int[]{6 * (i + 1) - 2, 6 * (i + 1), 6 * (i + 1) + 2});
        }
        P2.get(P2.size() - 1)[2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3.add(new int[]{12 * i + 3, 12 * i + 9});
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<int[]> P = SP(N, P2, P3);
            for (int[] p : P) {
                System.out.print((p[0] + " " + p[1]) + " ");
            }
        }
    }

    private static List<int[]> SP(int N, List<int[]> P2, List<int[]> P3) {
        if (N == 19999) {
            P2.addAll(P3);
            P2.set(0, new int[]{4, 8});
            return P2;
        }
        int _k = (int) Math.ceil((double) Math.max(N - 12500, 0) / 3);
        N -= 3 * _k;
        int k = N / 5;
        int m = N % 5;
        List<int[]> P = new ArrayList<>();
        P.addAll(P2.subList(0, k + _k));
        P.addAll(P3.subList(0, k));
        if (m == 1) {
            P.addAll(P3.subList(0, k - 1));
        } else if (m == 2) {
            P.addAll(P2.subList(0, k + _k));
            P.addAll(P3.subList(0, k + 1));
        } else if (m == 3) {
            P.addAll(P2.subList(0, k + 1 + _k));
        } else if (k >= 2499) {
            P.addAll(P2.subList(0, k + 2 + _k));
            P.addAll(P3.subList(0, k - 1));
        } else {
            P.addAll(P2.subList(0, k + _k));
            P.addAll(P3.subList(0, k + 2));
        }
        return P;
    }
}