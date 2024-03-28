import java.util.Scanner;

public class p03266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;

        if (k % 2 == 1) {
            ans = (n / k)**3;
        } else {
            ans = (n / k)**3 + ((n + k / 2) / k)**3;
        }

        System.out.println(ans);
    }
}