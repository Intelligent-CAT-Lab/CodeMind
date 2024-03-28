import java.util.Scanner;

public class p02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (((long)H * W * (X + Y)) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}