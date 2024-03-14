public class p01939 {
    static final long MOD = (long) Math.pow(10,9)+7;

    static long sum(long a, long d, long n) {
        return n*(2*a+(n-1)*d) / 2;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long s = 0;
        if (n == 1) {
            s = m+1;
        } else {
            s = sum(m+1,-n+1,1+m/(n-1));
            s *= 2;
            s -= (m+1);
        }

        System.out.println(s%MOD);
    }
}