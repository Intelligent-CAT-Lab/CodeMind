public class p01939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MOD = 1000000007;
        int s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            s = (1 + m / (n - 1)) * (2 * (m + 1) - (n - 1) * (1 + m / (n - 1))) / 2;
            s *= 2;
            s -= (m + 1);
        }
        System.out.println(s % MOD);
    }
}