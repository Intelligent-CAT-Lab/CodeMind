import java.util.HashSet;
import java.util.Scanner;

public class p03286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(convertToBaseNeg2(N));
    }

    public static String convertToBaseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        HashSet<Integer> set = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                set.add(r);
                N -= Math.pow(2, r);
            } else {
                int r = minus(N);
                set.add(r);
                N += Math.pow(2, r);
            }
        }
        int maxElement = set.stream().max(Integer::compare).get();
        int[] s = new int[maxElement + 1];
        for (int i = 0; i <= maxElement; i++) {
            if (set.contains(i)) {
                s[i] = 1;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = maxElement; i >= 0; i--) {
            result.append(s[i]);
        }
        return result.toString();
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}