import java.util.Scanner;

public class p03377 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}