import java.util.*;

public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, r = sc.nextInt(), a, b;
        a = n - 1;
        b = r - m * n;
        int d = 1;
        for (int i = 0; i <= a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i <= a + b; i++) {
            u *= i + 1;
        }
        System.out.println(a < 1 ? u / d : 0);
    }
}