import java.util.Scanner;

public class p02713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += Math.gcd(Math.gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
    }
}