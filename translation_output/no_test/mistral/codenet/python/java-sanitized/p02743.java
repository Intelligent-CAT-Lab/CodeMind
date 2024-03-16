import java.util.Scanner;

public class p02743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < (c - a - b) ** 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}