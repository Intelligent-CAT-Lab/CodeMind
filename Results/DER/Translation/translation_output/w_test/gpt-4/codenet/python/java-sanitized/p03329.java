import java.util.Scanner;

public class p03329 {
    private static int[] six = new int[7];
    private static int[] nine = new int[7];

    static {
        for (int i = 0; i < 7; i++) {
            six[i] = (int) Math.pow(6, 7 - i);
            nine[i] = (int) Math.pow(9, 7 - i);
        }
    }

    public static int DP(int n) {
        if (n < 6) {
            return n;
        }

        int tmp = n;
        int count6 = 0;
        int count9 = 0;

        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        count6 += DP(n);
        n = tmp;

        if (n < 9) {
            return count6;
        }

        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;

        return Math.min(count6, count9);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(DP(N));
    }
}