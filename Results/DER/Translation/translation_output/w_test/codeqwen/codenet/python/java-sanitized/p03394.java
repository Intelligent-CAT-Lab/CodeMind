import java.util.ArrayList;
import java.util.List;

public class p03394 {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        List<List<Integer>> P2 = new ArrayList<>();
        List<List<Integer>> P3 = new ArrayList<>();
        int limit = 30000;
        for (int i = 0; i < 5000; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(6 * (i + 1) - 2);
            temp.add(6 * (i + 1));
            temp.add(6 * (i + 1) + 2);
            P2.add(temp);
        }
        P2.get(4999).set(2, 2);
        for (int i = 0; i < 2500; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(12 * i + 3);
            temp.add(12 * i + 9);
            P3.add(temp);
        }
        if (N == 3) {
            System.out.println("2 3 25");
        } else if (N == 4) {
            System.out.println("2 3 4 9");
        } else if (N == 6) {
            System.out.println("2 3 4 6 9 12");
        } else {
            List<List<Integer>> P = SP(N);
            for (List<Integer> p : P) {
                for (int _p : p) {
                    System.out.print(_p + " ");
                }
                System.out.println();
            }
        }
    }

    public static List<List<Integer>> SP(int N) {
        if (N == 19999) {
            List<List<Integer>> P = new ArrayList<>();
            P.addAll(P2);
            P.addAll(P3);
            P