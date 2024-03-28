import java.util.Scanner;

public class p02981 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }
        System.out.println(ans);
    }
}