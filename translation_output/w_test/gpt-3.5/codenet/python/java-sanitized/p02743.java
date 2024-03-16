import java.util.Scanner;

public class p02743 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c - a - b < 0) {
            System.out.println("No");
        } else {
            if (4 * a * b < Math.pow((c - a - b), 2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}