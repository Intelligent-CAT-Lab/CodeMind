import java.util.Scanner;

public class p02256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }

        System.out.println(y);
    }
}