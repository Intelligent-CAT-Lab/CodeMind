import java.util.Scanner;

public class p03036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}