import java.util.Scanner;

public class p03266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        if (k % 2 == 1) {
            ans = (n / k) * (n / k) * (n / k);
        } else {
            ans = (n / k) * (n / k) * (n / k) + ((n + k / 2) / k) * (n + k / 2) / k;
        }
        System.out.println(ans);
    }
}