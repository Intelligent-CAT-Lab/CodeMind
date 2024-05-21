import java.util.*;

public class p02398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}