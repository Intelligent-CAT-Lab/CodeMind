import java.util.Scanner;

public class p03421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (n < a + (b - 1) || n > a + (b - 1) * a) {
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }

        n -= a;
        if (n == 0) {
            System.out.println();
            System.exit(0);
        }

        int loop = n / (b - 1);
        int option = n % (b - 1);

        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop + 1; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }

        System.out.println();
    }
}