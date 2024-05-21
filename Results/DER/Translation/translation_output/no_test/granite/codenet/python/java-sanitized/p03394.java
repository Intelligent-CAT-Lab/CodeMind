import java.util.*;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[25000][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 25000; i++) {
            P3[i][0] = 12 * i + 3;
            P3[i][1] = 12 * i + 9;
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<List<Integer>> P = new ArrayList<>();
            int _k = -(-((N - 12500) > 0? (N - 12500) : 0) / 3);
            N -= 3 * _k;
            int k = N / 5;
            int m = N % 5;
            if (m == 0) {
                for (int i = 0; i < k + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 1) {
                for (int i = 0; i < k + 1 + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k - 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 2) {
                for (int i = 0; i < k + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k + 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 3) {
                for (int i = 0; i < k + 1 + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (k >= 2499) {
                for (int i = 0; i < k + 2 + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k - 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else {
                for (int i = 0; i < k + _k; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k + 2; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            }
            for (List<Integer> p : P) {
                System.out.println(p.stream().map(Object::toString).collect(Collectors.joining(" ")));
            }
        }
    }
}