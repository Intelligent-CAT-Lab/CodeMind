import java.util.Scanner;

public class p02223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.print("1");
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.println("1");
            }
        }

        scanner.close();
    }
}