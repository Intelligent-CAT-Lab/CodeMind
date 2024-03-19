import java.util.*;
public class p02251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int x : new int[]{25, 10, 5, 1}) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}