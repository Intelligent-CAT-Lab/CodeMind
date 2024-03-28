import java.util.Scanner;

public class p02162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1, t2, r1, r2;
        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}