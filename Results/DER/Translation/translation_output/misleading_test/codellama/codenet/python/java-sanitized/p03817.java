import java.util.Scanner;

public class p03817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        int q = x / 11;
        int r = x % 11;
        ans += 2 * q;
        q = r / 6;
        ans += q;
        if (r > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }
}