import java.util.Scanner;

public class p01076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d;
        n = sc.nextInt();
        d = sc.nextInt();
        int result = 0;
        if (d == 1) {
            result = (n * (n - 1)) / 2;
        } else {
            result = ((n - 1) + (n - d - 1) * n) - ((n - d - 1) * (n + d - 2) / 2);
        }
        System.out.println(result);
    }
}