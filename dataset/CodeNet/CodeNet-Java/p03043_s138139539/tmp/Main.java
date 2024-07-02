import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
        int k = sc.nextInt();
System.out.println("[INST]7;k;sc.nextInt();"+k);

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
