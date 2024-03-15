import java.util.Scanner;

public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        int a = Math.min(n-1, r-m*n);
        int d = 1;
        for (int i = 1; i <= a; i++) {
            d *= i;
        }

        int u = 1;
        for (int i = b; i <= a+b; i++) {
            u *= i;
        }

        if (a < 1) {
            System.out.println(0);
        } else {
            System.out.println(u / d);
        }
    }
}