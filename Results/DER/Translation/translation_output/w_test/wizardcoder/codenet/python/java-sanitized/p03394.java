import java.util.*;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        List<List<Integer>> P2 = new ArrayList<>();
        List<List<Integer>> P3 = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            List<Integer> p2 = new ArrayList<>();
            p2.add(6 * (i + 1) - 2);
            p2.add(6 * (i + 1));
            p2.add(6 * (i + 1) + 2);
            P2.add(p2);
        }
        P2.get(4999).set(2, 2);
        for (int i = 0; i < 2500; i++) {
            List<Integer> p3 = new ArrayList<>();
            p3.add(12 * i + 3);
            p3.add(12 * i + 9);
            P3.add(p3);
        }

        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<List<Integer>> P = new ArrayList<>();
            int k = N / 5;
            int m = N % 5;
            if (m == 0) {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k));
            } else if (m == 1) {
                P.addAll(P2.subList(0, k + 1));
                P.addAll(P3.subList(0, k - 1));
            } else if (m == 2) {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k + 1));
            } else if (m == 3) {
                P.addAll(P2.subList(0, k + 1));
                P.addAll(P3.subList(0, k));
            } else if (k >= 2499) {
                P.addAll(P2.subList(0, k + 2));
                P.addAll(P3.subList(0, k - 1));
            } else {
                P.addAll(P2.subList(0, k));
                P.addAll(P3.subList(0, k + 2));
            }
            for (List<Integer> p : P) {
                System.out.print(p.get(0) + " " + p.get(1) + " ");
            }
        }
    }
}