import java.util.*;
public class p03352 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1;
        for (int b = 0; b < x; b++) {
            for (int p = 2; p < x; p++) {
                if (b ** p <= x) {
                    ans = Math.max(ans, b ** p);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}