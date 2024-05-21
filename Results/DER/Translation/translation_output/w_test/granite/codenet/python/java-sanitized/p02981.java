import java.util.Scanner;

public class p02981 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = b;
        if (n * a < b) {
            ans = n * a;
        }
        System.out.println(ans);
    }
}