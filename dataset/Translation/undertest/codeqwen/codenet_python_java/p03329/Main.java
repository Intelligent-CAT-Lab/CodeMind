import java.util.Arrays;

public class p03329 {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        int[] six = new int[]{6, 36, 216, 1296, 7776, 46656, 279936, 1679616};
        int[] nine = new int[]{9, 81, 729, 6561, 59049, 531441, 4782969, 43046721};
        System.out.println(DP(N, six, nine));
    }

    public static int DP(int n, int[] six, int[] nine) {
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
        count6 += DP(n, six, nine);
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
        count9 += DP(n, six, nine);
        n = tmp;
        return Math.min(count6, count9);
    }
}