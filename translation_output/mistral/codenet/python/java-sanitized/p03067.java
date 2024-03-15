import java.util.Scanner;

public class p03067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < c < b || a > c > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}