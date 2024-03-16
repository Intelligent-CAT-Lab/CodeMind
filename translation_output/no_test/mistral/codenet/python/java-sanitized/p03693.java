import java.util.Scanner;

public class p03693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, g, b;
        System.out.print("Enter RGB values separated by spaces: ");
        r = scanner.nextInt();
        g = scanner.nextInt();
        b = scanner.nextInt();

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}