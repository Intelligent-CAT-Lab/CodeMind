import java.util.Scanner;

public class p03329 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] six = new int[7];
        int[] nine = new int[7];
        for (int i = 1; i < 7; i++) {
            six[i] = (int) Math.pow(6, i);
            nine[i] = (int) Math.pow(9, i);
        }
        for (int i = 0; i < 7 / 2; i++) {
            int temp = six[i];
            six[i] = six[6 - i];
            six[6 - i] = temp;
            temp = nine[i];
            nine[i] = nine[6 - i];
            nine[6 - i] = temp;
        }
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