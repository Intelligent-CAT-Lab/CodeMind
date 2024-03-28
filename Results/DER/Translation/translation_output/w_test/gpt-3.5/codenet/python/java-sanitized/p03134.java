import java.util.Scanner;

public class p03134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        int mod = 998244353;

        long[] lis = new long[2*N+1];
        lis[0] = 1;
        int R = 0;
        int B = 0;
        int c = 0;

        for (char n : S.toCharArray()) {
            if (n == '0') {
                R += 2;
            } else if (n == '1') {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }

            long[] nlis = new long[2*N+1];

            for (int i = 0; i < 2*N; i++) {
                if (i < R) {
                    nlis[i+1] += lis[i];
                    nlis[i+1] %= mod;
                }

                if (c-i < B) {
                    nlis[i] += lis[i];
                    nlis[i] %= mod;
                }
            }

            lis = nlis;
            c++;
        }

        for (int loop = 0; loop < N; loop++) {
            long[] nlis = new long[2*N+1];

            for (int i = 0; i < 2*N; i++) {
                if (i < R) {
                    nlis[i+1] += lis[i];
                    nlis[i+1] %= mod;
                }

                if (c-i < B) {
                    nlis[i] += lis[i];
                    nlis[i] %= mod;
                }
            }

            lis = nlis;
            c++;
        }

        long sum = 0;
        for (long num : lis) {
            sum += num;
            sum %= mod;
        }

        System.out.println(sum);
    }
}