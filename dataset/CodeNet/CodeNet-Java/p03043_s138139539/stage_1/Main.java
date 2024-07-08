import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double ans = 0.0;
        for (int i = 1; i <= n; i++) {

            double p = 1;
            int tmp = i;

            while (tmp < k) {
                p *= 0.5;
                tmp *= 2;
            }
            ans += p / n;
        }

        System.out.println(ans);
    }
}
