import java.util.Scanner;

public class p02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if (((H * W) * (X + Y)) % 2 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}