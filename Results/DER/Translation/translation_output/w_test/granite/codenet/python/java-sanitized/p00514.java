import java.util.*;

public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = Math.min(n - 1, r - m * n);
        int b = r - m * n - a;
        long d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        long u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(a < 1? 0 : u / d);
    }
}