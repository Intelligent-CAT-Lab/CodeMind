class main:
    import java.util.Scanner;
    
    public class p02059 {
        static Scanner sc = new Scanner(System.in);
        static final long MOD = 998244353;
    
        public static void main(String[] args) {
            char[] S = sc.next().toCharArray();
            int N = S.length;
            long[] pow3 = new long[N + 1];
            pow3[0] = 1;
            for (int i = 0; i < N; i++) {
                pow3[i + 1] = pow3[i] * 3 % MOD;
            }
            Bits bsf1 = new Bits(N + 64);
            Bits bsf2 = new Bits(N + 64);
            Bits bsb1 = new Bits(N + 64);
            Bits bsb2 = new Bits(N + 64);
            int Q = 0;
            for (int i = 0; i < N; i++) {
                if (S[i] == 'G') {
                    bsf