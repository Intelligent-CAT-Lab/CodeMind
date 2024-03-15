import java.util.Scanner;

public class p03421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        n = Integer.parseInt(split[0]);
        a = Integer.parseInt(split[1]);
        b = Integer.parseInt(split[2]);
        if (n < a + (b - 1) || n > a + (b - 1) * a) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println("");
            System.exit(0);
        }
        int loop = n / (b - 1);
        int option = n % (b - 1);
        for (int j = 0; j < b - 1; j++) {
            if (option > 0) {
                for (int i = 0; i <= loop; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option--;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
        System.out.println("");
    }
}