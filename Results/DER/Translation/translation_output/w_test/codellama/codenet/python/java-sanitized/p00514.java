import java.util.Scanner;

public class p00514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int a = n - 1;
        int b = r - m * n;
        int d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}