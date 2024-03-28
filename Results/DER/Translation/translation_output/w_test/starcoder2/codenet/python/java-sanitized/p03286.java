import java.util.Scanner;

public class p03286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        int[] l = new int[32];
        int i = 0;
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l[i] = r;
                N -= (int) Math.pow(2, r);
            } else {
                int r = minus(N);
                l[i] = r;
                N += (int) Math.pow(2, r);
            }
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(l[j]);
        }
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += (int) Math.pow(2, n);
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
            p -= (int) Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}