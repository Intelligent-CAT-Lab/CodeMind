import java.util.Scanner;

public class p03329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for (int i = 0; i < 7; i++) {
            six[i] = (int) Math.pow(6, i);
            nine[i] = (int) Math.pow(9, i);
        }

        int count6 = 0;
        int count9 = 0;
        for (int i = 0; i < 7; i++) {
            if (six[i] <= N) {
                N -= six[i];
                count6++;
                break;
            }
        }
        count6 += DP(N);

        N = scanner.nextInt();
        if (N < 9) {
            return count6;
        }

        for (int i = 0; i < 7; i++) {
            if (nine[i] <= N) {
                N -= nine[i];
                count9++;
                break;
            }
        }
        count9 += DP(N);

        return Math.min(count6, count9);
    }

    private static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int i = 0; i < 7; i++) {
            if (six[i] <= n) {
                n -= six[i];
                count6++;
                break;
            }
        }
        count6 += DP(n);

        n = tmp;
        if (n < 9) {
            return count6;
        }

        for (int i = 0; i < 7; i++) {
            if (nine[i] <= n) {
                n -= nine[i];
                count9++;
                break;
            }
        }
        count9 += DP(n);

        return Math.min(count6, count9);
    }
}