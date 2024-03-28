import java.util.*;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = n; i > 1; i--) {
            if (n % i == 0 && n / i == n / (i * i)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}