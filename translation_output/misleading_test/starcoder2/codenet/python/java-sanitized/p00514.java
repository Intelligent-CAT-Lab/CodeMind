import java.util.*;
public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = Math.min(n-1, r-m*n);
        int b = Math.max(n-1, r-m*n);
        long d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }
        long u = 1;
        for (int i = b+1; i <= a+b; i++) {
            u *= i;
        }
        System.out.println(a < 1 ? 0 : u/d);
    }
}


Upvotes: 0