import java.util.Scanner;

public class p03286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;
        }
        int[] l = new int[100];
        int i = 0;
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l[i++] = r;
                N -= (int) Math.pow(2, r);
            } else {
                int r = minus(N);
                l[i++] = r;
                N += (int) Math.pow(2, r);
            }
        }
        int[] s = new int[i];
        for (int j = 0; j < i; j++) {
            s[j] = l[j];
        }
        for (int j = 0; j < i; j++) {
            System.out.print(s[j]);
        }
        System.out.println();
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