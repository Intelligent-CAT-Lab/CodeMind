import java.util.Scanner;

public class p02251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int x = 25; x >= 1; x--) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}