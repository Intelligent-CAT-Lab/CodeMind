import java.util.*;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 2500; i++) {
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
            int k = (N - 12500) / 3;
            int m = (N - 12500) % 3;
            if (m == 0) {
                for (int i = 0; i < k + 12500; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 1) {
                for (int i = 0; i < k + 12501; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k - 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 2) {
                for (int i = 0; i < k + 12500; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k + 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (m == 3) {
                for (int i = 0; i < k + 12501; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else if (k >= 2499) {
                for (int i = 0; i < k + 12502; i++) {
                    P.add(Arrays.asList(P2[i][0], P2[i][1], P2[i][2]));
                }
                for (int i = 0; i < k - 1; i++) {
                    P.add(Arrays.asList(P3[i][0], P3[i][1]));
                }
            } else {
                for (int i = 0; i < k + 12500; i++) {
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