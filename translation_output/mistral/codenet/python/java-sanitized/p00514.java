import java.util.*;

public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = Math.max(n - 1, r - m * n);
        int b = Math.min(n - 1, r - m * n);
        int d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }
        int u = 1;
        for (int i = 1; i <= b; i++) {
            u *= i;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}