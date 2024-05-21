public class p00007 {
    public static void main(String[] args) {
        double ans = 100000;
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000!= 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int) ans);
    }
}