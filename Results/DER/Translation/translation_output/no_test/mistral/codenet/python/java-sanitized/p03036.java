import java.util.Scanner;

public class p03036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, d, x;
        System.out.print("Enter the values of r, d and x: ");
        r = scanner.nextInt();
        d = scanner.nextInt();
        x = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}